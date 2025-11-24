package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제 이름(난이도) : ATM(S4)
 * 시간 : 140ms
 * 메모리: 14580KB
 * 링크 : https://www.acmicpc.net/problem/11399
 * */
class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] customer = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            customer[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(customer);

        int time = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                time += customer[j];
            }
        }

        System.out.println(time);
    }
}
