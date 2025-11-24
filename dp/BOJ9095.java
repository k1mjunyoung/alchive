package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ9095 {
    static int[] memo = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = dp(n);

            bw.write(String.valueOf(result) + "\n");
        }

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
            return 4;
        }
        if (memo[n] != 0) {
            return memo[n];
        }

        // 점화식 찾는게 중요!
        return memo[n] = dp(n-1) + dp(n-2) + dp(n-3);
    }
}
