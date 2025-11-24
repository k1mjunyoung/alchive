package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class boj2562_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            num = sc.nextInt();
            numbers.add(num);
        }

        int max = Collections.max(numbers);

        int index = numbers.indexOf(max);

        System.out.println(max);
        System.out.println(index+1);
    }
}
