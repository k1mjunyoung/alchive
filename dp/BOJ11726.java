package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ11726 {
    static int[] memo = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = dp(n);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    static int dp(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        if (n == 4) {
            return 5;
        }
        if (memo[n] != 0) {
            return memo[n];
        }

        // 값이 커지면 오버플로우가 발생하므로 정확한 값이 출력되지 않기때문에
        // 배열에 저장해줄 때마다 mod 연산을 해주어야 한다.
        return memo[n] = (dp(n-1) + dp(n-2)) % 10007;
    }
}
