package euler;

/**
 * 문제 이름 : 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면?
 * 시간 : 
 * 메모리: 
 * 링크 : https://euler.synap.co.kr/problem=1
 * */
public class Euler001 {
    public static void main(String[] args) {
        int limit = 1000;
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0) {
                sum += i;
                continue;
            }
            if (i % 5 == 0) {
                sum += i;
                continue;
            }
        }

        System.out.println(sum);
    }
}