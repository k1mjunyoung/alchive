package implementation;

import java.util.Scanner;

public class boj10951_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a + b);

            if (!sc.hasNext()) {
                break;
            }
        }
    }
}