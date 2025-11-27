package euler;

/**
 * 문제 이름: 피보나치 수열에서 4백만 이하이면서 짝수인 항의 합
 * 시간: 
 * 메모리: 
 * 링크: https://euler.synap.co.kr/problem=2
 * */
public class Euler002 {
    public static void main(String[] args) {
        int result = 0;
        int limit = 4000000;
        int prev = 0;
        int fibonacci = 1;
        int sum = 0;

        while(fibonacci <= limit) {
            sum = prev + fibonacci;
            if(sum % 2 == 0) {
                result += sum;
            }
            prev = fibonacci;
            fibonacci = sum;
        }

        System.out.println(result);
    }
}
