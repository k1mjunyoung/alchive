package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1012
 */
class BOJ1012 {
    // 1. 상태 정의
    static class State {
        int x;
        int y;
        
        State(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // 상 우 하 좌(시계 방향)
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    static int M, N;

    static int[][] field;
    static boolean[][] isVisited;
    static boolean[][] isGroupVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 가로길이
            M = Integer.parseInt(st.nextToken());
            // 세로길이
            N = Integer.parseInt(st.nextToken());

            // 밭 생성
            field = new int[N][M];
            
            // 방문 검사 배열
            isVisited = new boolean[N][M];
            isGroupVisited = new boolean[N][M];

            // 배추가 심어진 위치의 개수
            int K = Integer.parseInt(st.nextToken());

            // 배추 심기
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                field[Y][X] = 1;
            }

            // 필요한 지렁이 수
            int worm = 0;
            
            Queue<State> queue = new LinkedList<>();
            queue.add(new State(0, 0));
            
            while (!queue.isEmpty()) {
                State state = queue.poll();

                for (int d = 0; d < 4; d++) {
                    int nx = state.x + dx[d];
                    int ny = state.y + dy[d];

                    if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                        continue;
                    }

                    if (field[ny][nx] == 1) {
                        findGroup(nx, ny);
                        field[ny][nx] = 0;
                        worm++;
                        continue;
                    }

                    if (isVisited[ny][nx]) {
                        continue;
                    }

                    queue.add(new State(nx, ny));
                    isVisited[ny][nx] = true;
                }
            }

            System.out.println(worm);
        }
    }

    static void findGroup(int x, int y) {
        Queue<State> groupQueue = new LinkedList<>();
        groupQueue.add(new State(x, y));

        while (!groupQueue.isEmpty()) {
            State groupState = groupQueue.poll();

            for (int d = 0; d < 4; d++) {
                int nx = groupState.x + dx[d];
                int ny = groupState.y + dy[d];

                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }

                if (field[ny][nx] != 1) {
                    continue;
                }

                if (isGroupVisited[ny][nx]) {
                    continue;
                }

                groupQueue.add(new State(nx, ny));
                isGroupVisited[ny][nx] = true;
            }

            field[groupState.y][groupState.x] = 0;
        }
    }
}
