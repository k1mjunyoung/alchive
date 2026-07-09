package training;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class PGM181943 {
  public static void main(String[] args) {
    String myString = "He11oWor1d";
    String overwriteString = "lloWorl";
    int s = 2;

    Solution sol = new Solution();
    String result = sol.solution(myString, overwriteString, s);
    System.out.println(result);
  }

  static class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
      // char[] chars = my_string.toCharArray();
      // for (int i = 0; i < overwrite_string.length(); i++) {
      // chars[s + i] = overwrite_string.charAt(i);
      // }

      StringBuilder sb = new StringBuilder(my_string);
      sb.replace(s, s + overwrite_string.length(), overwrite_string);

      return new String(sb);
    }
  }
}
