/*
package array;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    boolean[] isVisited = new boolean[N];

    Queue<Integer> queue = new LinkedList<>();

    queue.add(*/
/* initialState *//*
 0);
    isVisited[*/
/* initialState *//*
 0] = true;

    while (!queue.isEmpty()) {
        int state = queue.poll();

        */
/* 현재 상태 state 처리 *//*


        for (int next : getNextStates(state)) {
            if (!*/
/* 번위 검사 조건 *//*
) {
                continue;
            }

            if (!*/
/* 유효성 검사 *//*
) {
                continue;
            }

            // 중복 검사
            if (isVisited[state]) {
                continue;
            }

            // 방문 처리
            isVisited[state] = true;
            queue.add(next);
        }
    }
}
*/
