package implementation;

import java.io.IOException;
import java.util.Scanner;

class BOJ10952 {
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
