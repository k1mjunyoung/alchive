package training;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181945
public class PGM181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i < a.length(); i++) {
          char c = a.charAt(i);
          System.out.println(c);
        }
    }
  }