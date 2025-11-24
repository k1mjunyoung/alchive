package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj2606_k1mjunyoung {
    static boolean[][] graph;
    static boolean[] isVisited;
    static int N; // 컴퓨터의 수(1 <= N <= 100)
    static int M; // 연결의 수(
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        isVisited = new boolean[N+1];

        int x, y;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[y][x] = true;
            graph[x][y] = true;
        }

        dfs(1);

        bw.write(String.valueOf(result - 1));
        bw.flush();
        bw.close();
    }

    static void dfs(int idx) {
        result++;
        isVisited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (!isVisited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
