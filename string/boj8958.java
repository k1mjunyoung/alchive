package string;

import java.util.Scanner;

public class boj8958_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int test = 0;

        while (test < testCase) {
            String values = sc.next();
            String[] oxValues = values.split("X");

            int totalScore = 0;

            for (int i = 0; i < oxValues.length; i++) {
                if (!oxValues[i].isEmpty()) {
                    int score = 0;

                    for (int j = 0; j < oxValues[i].length(); j++) {
                        score++;
                        totalScore += score;
                    }
                }
            }

            System.out.println(totalScore);

            test++;
        }
    }
}
