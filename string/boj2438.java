package string;

import java.util.Scanner;

public class boj2438_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
