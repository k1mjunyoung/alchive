package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ11724 {
    static int N, M;
    static boolean[][] graph;
    static boolean[] isVisited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new boolean[N+1][N+1];
        isVisited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        for (int i = 1; i <= N; i++) {
            if (!isVisited[i]) {
                dfs(i);
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    static void dfs(int idx) {
        if (isVisited[idx]) {
            return;
        }

        isVisited[idx] = true;

        for (int i = 1; i <= N; i++) {
            if (graph[idx][i]) {
                // System.out.println("dfs(" + i + ")");
                dfs(i);
            }
        }
    }
}
