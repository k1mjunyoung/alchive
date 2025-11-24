package datastructure.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1940
 *
 * 주몽은 철기군을 양성하기 위한 프로젝트에 나섰다.
 * 그래서 야철대장을 통해 철기군이 입을 갑옷을 만들게 하였다.
 * 야철대장은 주몽의 명에 따르기 위하여 연구에 착수하던 중 아래와 같은 사실을 발견하게 되었다.
 * 갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다.
 * 갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M(1 ≤ M ≤ 10,000,000)이 되면 갑옷이 만들어 지게 된다.
 * 야철대장은 자신이 만들고 있는 재료를 가지고 갑옷을 몇 개나 만들 수 있는지 궁금해졌다.
 * 이러한 궁금증을 풀어 주기 위하여 N(1 ≤ N ≤ 15,000) 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.
 */
class BOJ1940 {
    public static void main(String[] args) throws IOException {
        int n, m;
        int sum;
        int cnt = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        int[] eq = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            eq[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < n; j++) {
            for (int k = j+1; k < n; k++) {
                sum = eq[j] + eq[k];
                if (sum == m) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
