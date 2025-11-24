package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */
public class prg1844_k1mjunyoung {
    // 1. 상태 정의
    private static class State {
        public final int x;
        public final int y;
        public final int step;

        private State(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1, 0, 1, 0};

    public int Solution(int[][] maps) {
        // 2. 방문 검사 배열
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];

        // 3. 초기 상태
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, 1));
        isVisited[0][0] = true;

        // 4. 탐색 진행
        while (!queue.isEmpty()) {
            State state = queue.poll();

            // 5. 현재 상태 처리
            if (state.y == maps.length - 1 && state.x == maps[state.y].length - 1) {
                return state.step;
            }

            // 6. 전이 상태 생성
            for (int d = 0; d < 4; d++) {
                int nx = state.x + dx[d];
                int ny = state.y + dy[d];

                // 7. 범위 검사
                if (ny < 0 || ny >= maps.length || nx < 0 || nx >= maps[ny].length) {
                    continue;
                }

                // 8. 유효성 검사
                if (maps[ny][nx] != 1) {
                    continue;
                }


                // 9. 중복 검사
                if (isVisited[nx][ny]) {
                    continue;
                }

                // 10. 방문 처리 & 상태 전이
                isVisited[ny][nx] = true;
                queue.add(new State(nx, ny, state.step + 1));
            }
        }

        return -1;
    }
}
