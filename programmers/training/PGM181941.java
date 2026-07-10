package training;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */
public class PGM181941 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] arr = { "a", "b", "c" };

    System.out.println(sol.solution(arr));
  }

  static class Solution {
    public String solution(String[] arr) {
      StringBuilder sb = new StringBuilder();

      for (String str : arr) {
        sb.append(str);
      }
      return sb.toString();
    }
  }
}
