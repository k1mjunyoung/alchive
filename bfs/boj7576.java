package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/7576
 * 1트 실패: 예외처리 안함
 * 2트 실패: 시간 초과 -> 단순 순회할 때도 bfs를 사용해보자
 * 3트 실패: Pos 객체에 step 클래스 변수 추가해서 로직 단순화 했지만 메모리 초과
 * 4트 성공: 방문 처리 for문 안에서
 */
public class boj7576_k1mjunyoung {
    static class Pos {
        int y;
        int x;
        int step;

        Pos(int y, int x, int step) {
            this.y = y;
            this.x = x;
            this.step = step;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        // 가로
        int M = Integer.parseInt(st.nextToken());
        // 세로
        int N = Integer.parseInt(st.nextToken());
        int[][] box = new int[N][M];
        boolean[][] isVisited = new boolean[N][M];

        int[] dy = {-1, 0, 1, 0};
        int[] dx = { 0, 1, 0,-1};

        Queue<Pos> queue = new LinkedList<>();

        int tomato;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato = Integer.parseInt(st.nextToken());
                box[i][j] = tomato;
                if (tomato == 1) {
                    queue.add(new Pos(i, j, 0));
                }
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {
            Pos pos = queue.poll();

            if (box[pos.y][pos.x] == 0) {
                box[pos.y][pos.x] = 1;
                count = pos.step;
            }

            for (int d = 0; d < 4; d++) {
                int ny = pos.y + dy[d];
                int nx = pos.x + dx[d];

                if (ny < 0 || ny >= N || nx < 0 || nx >= M) {
                    continue;
                }
                if (box[ny][nx] == -1) {
                    continue;
                }
                if (isVisited[ny][nx]) {
                    continue;
                }

                queue.add(new Pos(ny, nx, pos.step + 1));
                isVisited[ny][nx] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    count = -1;
                    break;
                }
            }
        }

        System.out.print(count);
    }
}
