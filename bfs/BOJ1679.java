package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1697
 */
class BOJ1679 {
    static int N, K;
    static int[] map = new int[100001];
    static boolean[] isVisited = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs(N);
        System.out.println(map[K]);
    }

    private static int bfs(int pos) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(pos);

        map[pos] = 0;
        isVisited[pos] = true;

        while (!queue.isEmpty()) {
            Integer now = queue.poll();

            if (now == K) {
                return map[now];
            }

            if (now-1 >= 0 && !isVisited[now-1]) {
                map[now-1] = map[now] + 1;
                queue.add(now-1);
                isVisited[now-1] = true;
            }

            if (now+1 < map.length && !isVisited[now+1]) {
                map[now+1] = map[now] + 1;
                queue.add(now+1);
                isVisited[now+1] = true;
            }

            if (now*2 < map.length && !isVisited[now*2]) {
                map[now*2] = map[now] + 1;
                queue.add(now*2);
                isVisited[now*2] = true;
            }

            isVisited[now] = true;
        }

        return 0;
    }
}
