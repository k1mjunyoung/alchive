#!/usr/bin/env node
// Coterview 풀이 실행 드라이버
//
// 이 저장소는 빌드 시스템이 없는 알고리즘 풀이 아카이브다. "실행"은 곧
// 개별 .java 파일 하나를 (디렉토리명 = package 규칙에 맞춰) 컴파일하고
// 실행하는 것을 뜻한다. 이 드라이버가 그 과정을 한 방에 처리한다.
//
//   node driver.mjs <파일.java> [--input <입력파일>] [--stdin "<문자열>"] [--keep]
//
//   <파일.java>       실행할 풀이 파일 (예: dp/BOJ11726.java)
//   --input <파일>    stdin 으로 넣을 입력 파일 (BOJ 등 표준입력 문제용)
//   --stdin "<문자열>" stdin 으로 넣을 문자열 (개행은 \n)
//   --keep            컴파일 산출물(.class) 임시 폴더를 지우지 않고 경로 출력
//
// PGM 문제는 보통 main 안에 테스트 케이스가 하드코딩돼 있어 입력이 필요 없다.
// BOJ/SWEA 문제는 표준입력을 읽으므로 --input 또는 --stdin 으로 입력을 준다.

import { readFileSync, mkdtempSync, rmSync, existsSync } from "node:fs";
import { spawnSync } from "node:child_process";
import { tmpdir } from "node:os";
import { join, basename } from "node:path";

function die(msg, code = 1) {
  console.error(`[driver] ${msg}`);
  process.exit(code);
}

// ── 인자 파싱 ────────────────────────────────────────────────
const args = process.argv.slice(2);
let file = null;
let inputFile = null;
let stdinStr = null;
let keep = false;

for (let i = 0; i < args.length; i++) {
  const a = args[i];
  if (a === "--input") inputFile = args[++i];
  else if (a === "--stdin") stdinStr = args[++i];
  else if (a === "--keep") keep = true;
  else if (a === "-h" || a === "--help") {
    console.log("usage: node driver.mjs <파일.java> [--input <파일>] [--stdin \"...\"] [--keep]");
    process.exit(0);
  } else if (!file) file = a;
  else die(`알 수 없는 인자: ${a}`);
}

if (!file) die("실행할 .java 파일 경로를 지정하세요. 예: node driver.mjs dp/BOJ11726.java");
if (!file.endsWith(".java")) die(`.java 파일이 아닙니다: ${file}`);
if (!existsSync(file)) die(`파일을 찾을 수 없습니다: ${file}`);

// ── package + 클래스명 → FQCN 계산 ──────────────────────────
const src = readFileSync(file, "utf8");
const pkgMatch = src.match(/^\s*package\s+([\w.]+)\s*;/m);
const pkg = pkgMatch ? pkgMatch[1] : null;
const className = basename(file, ".java");
const fqcn = pkg ? `${pkg}.${className}` : className;

// ── 컴파일 ──────────────────────────────────────────────────
const outDir = mkdtempSync(join(tmpdir(), "coterview-"));
console.error(`[driver] 컴파일: ${file}  →  ${fqcn}`);
const javac = spawnSync("javac", ["-encoding", "UTF-8", "-d", outDir, file], {
  stdio: ["ignore", "inherit", "inherit"],
});
if (javac.status !== 0) {
  if (!keep) rmSync(outDir, { recursive: true, force: true });
  die(`컴파일 실패 (javac exit ${javac.status})`, javac.status || 1);
}

// ── 실행 ────────────────────────────────────────────────────
let input;
if (inputFile) {
  if (!existsSync(inputFile)) die(`입력 파일을 찾을 수 없습니다: ${inputFile}`);
  input = readFileSync(inputFile);
} else if (stdinStr != null) {
  input = stdinStr.replace(/\\n/g, "\n");
}

console.error(`[driver] 실행: java -cp <out> ${fqcn}${input != null ? " (+stdin)" : ""}`);
console.error("[driver] ── 출력 ──────────────────────────");
const run = spawnSync("java", ["-cp", outDir, fqcn], {
  input: input, // undefined면 stdin 없음(EOF). main 없는 파일은 여기서 에러가 뜬다.
  stdio: [input != null ? "pipe" : "ignore", "inherit", "inherit"],
});

if (keep) console.error(`[driver] .class 유지: ${outDir}`);
else rmSync(outDir, { recursive: true, force: true });

if (run.status !== 0) die(`실행 종료 코드 ${run.status}`, run.status || 1);
console.error("[driver] ✓ 정상 종료");
