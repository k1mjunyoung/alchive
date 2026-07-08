package training;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181950
public class PGM181950 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String newStr = str.repeat(n);
        System.out.println(newStr);
    }
}
