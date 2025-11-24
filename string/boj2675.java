package string;

import java.util.Scanner;

public class boj2675_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int test = 1;

        while (test <= testCase) {
            int iterator = sc.nextInt();
            String value = sc.next();

            String result = "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < value.length(); i++) {
                for (int j = 0; j < iterator; j++) {
                    sb.append(value.charAt(i));
                }
            }

            System.out.println(sb);

            test++;
        }
    }
}
