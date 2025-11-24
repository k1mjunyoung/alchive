package dfs;

import java.util.Stack;

class DFS {
    int N = 10;

    // (1) 방문 검사 배열
    boolean[] isVisited = new boolean[N];

    public void dfs() {

        Stack<Integer> stack = new Stack<>();

        // (2) 초기 상태
        stack.add(/* initialState */ 0);

        // (3) 탐색 진행
        while (!stack.isEmpty())

        {
            int state = stack.pop();

            // (4) 중복 검사
            if (isVisited[state]) continue;
            isVisited[state] = true;

            // (5) 현재 상태 처리
            /* 현재 상태 state 처리 */

            // (6) 전이 상태 생성
            for (int next : getNextStates(state)) {
                // (7) 범위 검사
                if (!/* 범위 검사 조건 */ false) {
                    // 문제 범위를 벗어나는 상태 제외
                    continue;
                }

                // (8) 유효성 검사
                if (!/* 유효성 검사 조건*/ false) {
                    // 문제의 조거을 어기는 상태 재외
                    continue;
                }

                // (9) 상태 전이
                stack.push(next);
            }
        }
    }

    // 컴파일 에러 방지를 위한 임시 메서드
    private int[] getNextStates(int state) {
        int[] nextStates = new int[N];

        return nextStates;
    }
}
