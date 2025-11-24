package implementation;

import java.io.IOException;
import java.util.Scanner;

public class boj10952_k1mjunyoung {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a, b;

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }
    }
}
