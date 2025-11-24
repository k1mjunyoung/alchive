package beginner;

/**
 * 문제: 나이출력(입문)
 * 시간: 0.03ms
 * 메모리: 77.8MB
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120820
 */
class PGM120820 {
    class Solution {
        public int solution(int age) {
            int answer = 0;
            answer = 2022 - age + 1;
            return answer;
        }
    }
}