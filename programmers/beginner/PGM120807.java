package beginner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120807
 */
public class PGM120807 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution(2, 3));
  }

  static class Solution {
    public int solution(int num1, int num2) {
      int answer = 0;

      if (num1 == num2) {
        answer = 1;
      } else {
        answer = -1;
      }

      return answer;
    }
  }
}
