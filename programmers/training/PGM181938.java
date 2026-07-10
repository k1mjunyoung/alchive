package training;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */
public class PGM181938 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int a = 2, b = 91;

    System.out.println(sol.solution(a, b));
  }

  static class Solution {
    public int solution(int a, int b) {
      int answer = 0;

      answer = getBiggerOne(a, b);

      return answer;
    }

    public int getBiggerOne(int a, int b) {
      String str = String.valueOf(a) + String.valueOf(b);
      int strSum = Integer.parseInt(str);
      int numSum = 2 * a * b;

      if (strSum >= numSum) {
        return strSum;
      }

      return numSum;
    }
  }
}
