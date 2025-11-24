package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>(N);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            numbers.add(x);
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);

        Collections.sort(sortedNumbers);

        Map<Integer, Integer> numberMap = new HashMap<>();

        int index = 0;
        for (int number : sortedNumbers) {
            if (!numberMap.containsKey(number)) {
                numberMap.put(number, index);
                index++;
            }
        }

        for (int number : numbers) {
            bw.write(String.valueOf(numberMap.get(number)) + " ");
        }

        bw.flush();
        bw.close();
    }
}
