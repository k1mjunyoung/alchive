package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class boj10818_k1mjunyoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<Integer> nums = new ArrayList<>();

        int num;
        for (int i = 0; i < size; i++) {
            num = sc.nextInt();
            nums.add(num);
        }

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.printf("%d %d\n", min, max);
    }
}
