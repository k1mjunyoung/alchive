package training;

import java.util.Arrays;

/**
 * 문제 이름: flag에 따라 다른 값 반환하기
 * 난이도: Level
 * 정확성:
 * 효율성:
 * 합계:  / 100.0
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */
class PGM181933 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 4, b = 7;
        boolean flag = true;
        System.out.println(sol.solution(a, b, flag));
    }
}

class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true) {
          answer = a + b;
        } else {
          answer = a - b;
        }
        return answer;
    }
}
