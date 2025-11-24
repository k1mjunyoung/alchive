package bfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class boj2667_k1mjunyoung {
    private static class State {
        int y;
        int x;

        State(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {-1, 0, 1, 0};

    private static int mapSize;
    private static int[][] map;
    private static boolean[][] isVisited;

    private static int house;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mapSize = sc.nextInt();

        map = new int[mapSize][mapSize];
        isVisited = new boolean[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++) {
            String values = sc.next();
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = values.charAt(j) - '0';
            }
        }

//        System.out.println("---------------------------");
//        for (int i = 0; i < mapSize; i++) {
//            for (int j = 0; j < mapSize; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("---------------------------");

        int groups = 0;
        List<Integer> housePerGroup = new ArrayList<>();

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == 1 && !isVisited[i][j]) {
                    house = 0;
                    bfs(i, j);
                    housePerGroup.add(house);
                    groups++;
                }
            }
        }

        System.out.println(groups);

        Collections.sort(housePerGroup);

        for (int i = 0; i < housePerGroup.size(); i++) {
            System.out.println(housePerGroup.get(i));
        }
    }

    private static void bfs(int y, int x) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(y, x));

        while (!queue.isEmpty()) {
            State state = queue.poll();

            // 현재 상태 처리를 꼭 해주자
            if (map[state.y][state.x] == 1) {
                house++;
                isVisited[state.y][state.x] = true;
            }

            for (int d = 0; d < 4; d++) {
                int ny = state.y + dy[d];
                int nx = state.x + dx[d];

                if (ny < 0 || ny >= mapSize || nx < 0 || nx >= mapSize) {
                    continue;
                }

                if (map[ny][nx] != 1) {
                    continue;
                }

                if (isVisited[ny][nx]) {
                    continue;
                }

                isVisited[ny][nx] = true;
                queue.add(new State(ny, nx));
            }
        }
    }
}
