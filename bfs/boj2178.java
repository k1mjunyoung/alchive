package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2178_k1mjunyoung {
    // 1. 좌표, 몇번째인지 저장할 객체 구현
    static class Pos {
        int x;
        int y;
        int step;

        Pos(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    static int[] dx = { 0, 1, 0,-1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        boolean[][] isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String values = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = values.charAt(j) - '0';
            }
        }

        int result;

        // 2. 초기 상태 세팅
        Queue<Pos> queue = new LinkedList<>();
        queue.add(new Pos(0, 0, 1));

        // 3. 탐색
        while (!queue.isEmpty()) {
            Pos pos = queue.poll();

            // 4. 현재 맵의 끝이라면 현재 객체의 step 출력하고 break;
            if (pos.y == N - 1 && pos.x == M - 1) {
                result = pos.step;
                System.out.println(result);
                break;
            }

            // 5. 전이 상태 생성
            for (int d = 0; d < 4; d++) {
                int nx = pos.x + dx[d];
                int ny = pos.y + dy[d];

                // 6. 범위 검사
                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }

                // 7. 유효성 검사
                if (map[ny][nx] != 1) {
                    continue;
                }

                // 8. 중복 검사(무한루프 방지)
                if (isVisited[ny][nx]) {
                    continue;
                }

                // 9. 방문 처리, 다음 큐에 추가
                isVisited[ny][nx] = true;
                queue.add(new Pos(nx, ny, pos.step+1));
            }
        }
    }
}
