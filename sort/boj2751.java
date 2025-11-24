package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 수 정렬하기 2
 * https://www.acmicpc.net/problem/2751
 *
 *  1. Arrays.sort로 풀면 시간초과
 *  Arrays.sort() 의 경우 dual-pivot Quicksort 알고리즘을 사용, 평균 시간복잡도가 O(nlogn) 최악의 경우 시간복잡도는 O(n2)
 *  -> Collections.sort() 사용
 *  Collections.sort()은 Timsort
 *  Timsort의 경우 합병 및 삽입정렬 알고리즘을 사용, 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn), 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n), 최악의 경우는 O(n2)
 *  두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 함
 *
 *  2. println 사용하면 시간초과 -> StringBuilder 사용
 */
public class boj2751_k1mjunyoung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size;
        size = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers.add(number);
        }

        Collections.sort(numbers);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.print(sb);
    }
}
