package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class boj14940_k1mjunyoung {
    static int N, M;
    static int[][] map;
    static int[][] newMap;
    static boolean[][] isVisited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    static class Pos {
        int x;
        int y;

        Pos() {}

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Pos.class.getSimpleName() + "[", "]")
                    .add("x=" + x)
                    .add("y=" + y)
                    .toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        newMap = new int[N][M];
        isVisited = new boolean[N][M];

        Pos target = new Pos();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                int value = Integer.parseInt(st.nextToken());
                map[i][j] = value;
                if (value == 2) {
                    target.x = j;
                    target.y = i;
                }
            }
        }

        /*System.out.println("<<< map >>>");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }*/

        //System.out.println("target = " + target);

        getAllDistance(target);

        //System.out.println("<<< newMap >>>");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!isVisited[i][j] && map[i][j] == 1) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(newMap[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void getAllDistance(Pos target) {
        Queue<Pos> queue = new LinkedList<>();
        queue.add(target);
        isVisited[target.y][target.x] = true;

        while (!queue.isEmpty()) {
            Pos current = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nx = current.x + dx[d];
                int ny = current.y + dy[d];

                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }
                if (map[ny][nx] == 0) {
                    continue;
                }
                if (isVisited[ny][nx]) {
                    continue;
                }

                queue.add(new Pos(nx, ny));
                newMap[ny][nx] = newMap[current.y][current.x] + 1;
                isVisited[ny][nx] = true;
            }
        }
    }
}
