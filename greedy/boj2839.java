package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2839
 */
public class boj2839_k1mjunyoung {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int sugar = Integer.parseInt(bufferedReader.readLine());

        int maxQuo = sugar / 5;
        int quo3 = 0;

        int result = -1;

        while(maxQuo >= 0) {
            int rmd5 = sugar - (maxQuo * 5);

            if (rmd5 % 3 == 0) {
                quo3 = rmd5 / 3;
                result = maxQuo + quo3;
                break;
            }

            maxQuo--;
        }

        stringBuilder.append(result);

        System.out.print(stringBuilder);
    }
}
/*
18 4
4 -1
6 2
9 3
11 3
 */