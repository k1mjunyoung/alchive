package training;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class PGM181939 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    int a = 9, b = 91;

    System.out.println(sol.solution(a, b));
  }

  static class Solution {
    public int solution(int a, int b) {
      int answer = 0;

      String strA = intToString(a);
      String strB = intToString(b);

      answer = getBiggerOne(strA, strB);

      return answer;
    }

    public String intToString(int num) {
      return String.valueOf(num);
    }

    public int getBiggerOne(String str1, String str2) {
      String sum1 = str1 + str2;
      String sum2 = str2 + str1;

      int intSum1 = Integer.parseInt(sum1);
      int intSum2 = Integer.parseInt(sum2);

      if (intSum1 >= intSum2) {
        return intSum1;
      }

      return intSum2;
    }
  }
}
