package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class boj11720_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        String value = sc.next();

        int result = 0;

        for (int i = 0; i < length; i++) {
            String num = String.valueOf(value.charAt(i));
            result += Integer.parseInt(num);
        }

        System.out.println(result);
    }
}
