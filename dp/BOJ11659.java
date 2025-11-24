package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ11659 {
    static int[] numbers;
    static int[] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        numbers = new int[N+1];
        sum = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int endSum = dp(end);
            int startSum = dp(start);

            int result = endSum - startSum + numbers[start];

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int dp(int idx) {
        if (idx == 0) {
            return 0;
        }
        if (sum[idx] != 0) {
            return sum[idx];
        }

        return sum[idx] = numbers[idx] + dp(idx-1);
    }
}
