package implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 문제 이름 : 듣보잡
 * 난이도: 실버4
 * 시간 : 288ms
 * 메모리: 26000KB
 * 링크 : https://www.acmicpc.net/problem/1764
 * */
class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 듣도 못한 사람 수
        int N = Integer.parseInt(st.nextToken());
        // 보도 못한 사람 수
        int M = Integer.parseInt(st.nextToken());

        Set<String> neverHeard = new HashSet<>();

        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }

        List<String> neverHeardAndSeen = new ArrayList<>();

        // HashSet.contains -> O(1)
        // ArrayList.contains -> O(n)
        for (int i = 0; i < M; i++){
            String neverSeen = br.readLine();
            if (neverHeard.contains(neverSeen)) {
                neverHeardAndSeen.add(neverSeen);
            }
        }

        Collections.sort(neverHeardAndSeen);

        sb.append(neverHeardAndSeen.size()).append("\n");

        for (String never : neverHeardAndSeen) {
            sb.append(never).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
