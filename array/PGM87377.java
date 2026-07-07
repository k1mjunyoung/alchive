package array;

import java.util.Arrays;

/**
 * 문제 이름:
 * 난이도: Level
 * 정확성:
 * 효율성:
 * 합계:  / 100.0
 * 링크:
 */
class PGM87377 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // ── 테스트 케이스 ──────────────────────────────
        // 프로그래머스 문제의 마지막(또는 실패한) 테스트 케이스를 여기에 넣으세요.
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};

        // ── 호출 + 출력 ───────────────────────────────
        // 반환 타입에 맞춰 출력 방법을 고르세요.
        //  - String[] / int[]     → Arrays.toString(...)
        //  - int[][] / String[][] → Arrays.deepToString(...)
        //  - int / String         → 그대로 println(...)
        System.out.println(Arrays.toString(sol.solution(line)));
    }
}

// ↓↓↓ 여기부터가 프로그래머스에 복사/붙여넣기 하는 부분 ↓↓↓
class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        return answer;
    }
}
