package training;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class PGM181942 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    String str1 = "aaaaa";
    String str2 = "bbbbb";

    String answer = sol.solution(str1, str2);
    System.out.println(answer);
  }

  static class Solution {
    public String solution(String str1, String str2) {
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < str1.length(); i++) {
        char ai = str1.charAt(i);
        char bi = str2.charAt(i);
        sb.append(ai);
        sb.append(bi);
      }

      return sb.toString();
    }
  }
}
