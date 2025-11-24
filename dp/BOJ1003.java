package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 문제 이름 : 피보나치 함수
 * 난이도: 실버3
 * 시간 : 128ms
 * 메모리: 14228KB
 * 링크 : https://www.acmicpc.net/problem/1003
 * */
class BOJ1003 {
    static final int MAX = 50;
    static int[] count0 = new int[MAX];
    static int[] count1 = new int[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());

            sb.append(getCount0(N)).append(" ").append(getCount1(N)).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    static int getCount0(int N) {
        if (N == 0) {
            return 1;
        }
        if (N == 1) {
            return 0;
        }
        if (count0[N] != 0) {
            return count0[N];
        }
        return count0[N] = getCount1(N-1);
    }

    static int getCount1(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (count1[N] != 0) {
            return count1[N];
        }
        return count1[N] = getCount0(N-1) + getCount1(N-1);
    }
}
