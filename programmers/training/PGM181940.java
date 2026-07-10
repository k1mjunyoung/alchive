package training;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
public class PGM181940 {
  public static void main(String[] args) {
    Solution sol = new Solution();

    String myString = "string";
    int k = 3;

    System.out.println(sol.solution(myString, k));
  }

  static class Solution {
    public String solution(String my_string, int k) {
      String answer = my_string.repeat(k);
      return answer;
    }
  }
}
