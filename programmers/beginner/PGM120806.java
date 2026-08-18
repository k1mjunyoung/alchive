package beginner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
public class PGM120806 {
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.solution(3, 2));

  }

  static class Solution {
    public int solution(int num1, int num2) {
      // TODO: 굳이 Double 래퍼 클래스로 박싱할 필요가 있을까?
      // num1을 (double)로 캐스팅하면 원시타입 단계에서 나눗셈이 double 연산이 되므로,
      // Double.valueOf() / intValue() 없이 (double) num1 / num2 * 1000 형태로 간결하게 쓸 수 있음
      Double dNum1 = Double.valueOf(num1);
      Double dNum2 = Double.valueOf(num2);
      Double result = dNum1 / dNum2;
      result *= 1000;

      int answer = result.intValue();
      return answer;
    }
  }
}
