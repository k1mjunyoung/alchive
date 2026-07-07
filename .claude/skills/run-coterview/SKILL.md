---
name: run-coterview
description: Coterview 알고리즘 풀이 파일을 컴파일하고 실행한다. BOJ/PGM/SWEA/Euler 개별 .java 풀이를 run/build/compile/execute/test 하거나 표준입력을 넣어 돌려볼 때 사용. "이 문제 실행해줘", "BOJ11726 돌려봐", "풀이 컴파일" 같은 요청에 auto-load.
---

# run-coterview

Coterview는 빌드 시스템(Maven/Gradle)이 없는 **알고리즘 풀이 아카이브**다. 앱을 띄우는 게 아니라 개별 `.java` 풀이 파일 하나를 컴파일해서 돌린다. 까다로운 점은 **디렉토리명이 곧 `package`명**이라서(`dp/BOJ11726.java` → `package dp;` → 실행은 `java ... dp.BOJ11726`) FQCN을 손으로 맞춰야 한다는 것. 드라이버 `.claude/skills/run-coterview/driver.mjs`가 이걸 자동으로 처리한다.

모든 경로는 저장소 루트(`<unit>/`) 기준이다.

## Prerequisites

- **JDK 21** (`java`, `javac` on PATH). 이 저장소 기준: Zulu 21.
- **Node.js** (드라이버 실행용). 검증 환경: v22.

설치 확인:
```bash
javac -version   # javac 21.x
node -v          # v22.x
```

## Run (agent path) — 드라이버

풀이 파일 경로 하나를 넘기면 컴파일 → 실행까지 한 번에 한다. `.class` 산출물은 OS 임시 폴더에 만들어지고 자동 정리된다(저장소를 더럽히지 않음).

**PGM 문제** — `main`에 테스트 케이스가 하드코딩돼 있어 입력이 필요 없다:
```bash
node .claude/skills/run-coterview/driver.mjs hash/PGM42576.java
# → leo
```

**BOJ/SWEA 문제** — 표준입력을 읽으므로 입력을 준다. 인라인 문자열(`--stdin`, 개행은 `\n`) 또는 파일(`--input`):
```bash
node .claude/skills/run-coterview/driver.mjs dp/BOJ11726.java --stdin "9"
# → 55

printf '7\n1 2 3 4 5 6 7\n' > /tmp/in.txt
node .claude/skills/run-coterview/driver.mjs implementation/BOJ10818.java --input /tmp/in.txt
# → 1 7
```

**루트의 템플릿 하버스** — `PGMTemplate.java`는 `package`가 없는 루트 파일이며, 드라이버가 그대로 처리한다(FQCN = 클래스명):
```bash
node .claude/skills/run-coterview/driver.mjs PGMTemplate.java
# → []   (Solution 스텁이 빈 배열 반환)
```

**`.class`를 남겨 디버깅**하려면 `--keep`:
```bash
node .claude/skills/run-coterview/driver.mjs hash/PGM42576.java --keep
# → ... [driver] .class 유지: C:\...\coterview-XXXX
```

## Run (human path)

IntelliJ IDEA / VS Code(Extension Pack for Java)에서 파일을 열고 `main`의 ▷ Run을 누른다. BOJ 문제는 실행 구성의 Redirect Input으로 입력 파일을 지정해야 한다. 헤드리스/자동화 상황에서는 위 드라이버가 유일하게 재현 가능한 경로다.

## Gotchas

- **`package` = 디렉토리, 클래스 = 파일명.** `datastructure/slidingwindow/BOJ12891.java` → `package datastructure.slidingwindow;` → FQCN `datastructure.slidingwindow.BOJ12891`. 드라이버는 소스의 `package` 줄을 읽어 이걸 계산하므로, **파일을 폴더 밖으로 옮기면 `package` 줄도 같이 고쳐야** 컴파일된다.
- **일부 PGM 파일은 `main`이 없어서 그대로는 실행 불가.** 예: `programmers/beginner/PGM120802.java`는 `Solution`이 `main` 없는 내부 클래스라 실행하면 `기본 메서드를 찾을 수 없습니다`(main not found)로 종료 코드 1이 난다. 이런 파일은 "프로그래머스에 붙여넣는 원본"이지 로컬 실행용이 아니다. 돌려보려면 `Solution` 코드를 루트 `PGMTemplate.java`의 `Solution` 블록에 붙여넣고 `PGMTemplate.java`를 실행한다.
- **같은 문제 번호가 여러 폴더에 중복 존재**(예: `BOJ2839`가 greedy·implementation·dp에). 각각 package가 달라 FQCN이 다르므로, 실행하려는 파일의 **경로를 정확히** 지정한다.
- **Windows 콘솔에서 java의 한글 stderr가 깨져 보임**(mojibake). 이건 콘솔 코드페이지 문제일 뿐 드라이버/컴파일 오류가 아니다. 종료 코드로 성공/실패를 판단하라.
- **stdin 없이 BOJ 파일을 실행하면** `readLine()`이 `null`을 반환해 `NumberFormatException`/`NPE`로 죽는다. 입력이 필요한 문제엔 반드시 `--stdin`/`--input`을 준다.

## Troubleshooting

| 증상 | 원인 → 조치 |
|---|---|
| `컴파일 실패 (javac exit 1)` + `<identifier> expected` 등 | 소스 자체의 문법 오류. javac가 가리키는 줄을 고친다(예: 매개변수 타입 누락 `solution(line)` → `solution(int[][] line)`). |
| `기본 메서드를 찾을 수 없습니다` / `main method not found` | 그 파일에 `main`이 없음. `PGMTemplate.java` 하버스로 감싸 실행. |
| `파일을 찾을 수 없습니다` | 경로 오타 또는 루트 기준이 아님. 저장소 루트에서 상대경로로 지정. |
| 실행이 멈춰 있음(hang) | BOJ 파일이 stdin을 기다리는 중. `--stdin`/`--input`으로 입력 공급. |
