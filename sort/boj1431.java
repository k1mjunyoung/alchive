package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class boj1431_k1mjunyoung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guitarSize = Integer.parseInt(scanner.nextLine());

        List<String> guitars = new ArrayList<>();

        for (int i = 0; i < guitarSize; i++) {
            String guitar = scanner.nextLine();
            guitars.add(guitar);
        }

        // 1. 길이 순 정렬(버블 정렬)
/*        for (int i = 0; i < guitarSize; i++) {
            if (i == guitarSize - 1) {
                break;
            }
            if (guitars.get(i).length() > guitars.get(i+1).length()) {
                String temp = guitars.get(i+1);
                guitars.set(i+1, guitars.get(i));
                guitars.set(i, temp);
            }
        }*/

        Collections.sort(guitars, (String guitar1, String guitar2) -> guitar2.length() - guitar1.length());

        // 2. 숫자 합 크기 순 정렬(버블 정렬)
/*        for (int i = 0; i < guitarSize; i++) {
            if (i == guitarSize - 1) {
                break;
            }
            if (guitars.get(i).length() == guitars.get(i+1).length()) {
                String guitar1 = guitars.get(i);
                String guitar2 = guitars.get(i+1);

                guitar1 = guitar1.replaceAll("[^0-9]", "");
                guitar2 = guitar2.replaceAll("[^0-9]", "");

                int guitar1sum = 0, guitar2sum = 0;

                if (guitar1.length() > 1) {
                    for (int j = 0; j < guitar1.length(); j++) {
                        guitar1sum += Integer.parseInt(guitar1.substring(j, j+1));
                    }
                }

                if (guitar2.length() > 1) {
                    for (int j = 0; j < guitar1.length(); j++) {
                        guitar2sum += Integer.parseInt(guitar2.substring(j, j+1));
                    }
                }

                if (guitar1sum > guitar2sum) {
                    String temp = guitars.get(i+1);
                    guitars.set(i+1, guitars.get(i));
                    guitars.set(i, temp);
                }
            }
        }*/

        // 3. 사전순 정렬
        /*for (int i = 0; i < guitarSize; i++) {
            if (i == guitarSize - 1) {
                break;
            }

            String guitar1 = guitars.get(i);
            String guitar2 = guitars.get(i+1);

            guitar1 = guitar1.replaceAll("[^0-9]", "");
            guitar2 = guitar2.replaceAll("[^0-9]", "");

            int guitar1sum = 0, guitar2sum = 0;

            if (!guitar1.isEmpty()) {
                for (int j = 0; j < guitar1.length(); j++) {
                    guitar1sum += Integer.parseInt(guitar1.substring(j, j+1));
                }
            }

            if (!guitar2.isEmpty()) {
                for (int j = 0; j < guitar1.length(); j++) {
                    guitar2sum += Integer.parseInt(guitar2.substring(j, j+1));
                }
            }

            if (guitars.get(i).length() == guitars.get(i+1).length() && guitar1sum == guitar2sum) {
                if (guitar1.compareTo(guitar2) > 0) {
                    String temp = guitars.get(i+1);
                    guitars.set(i+1, guitars.get(i));
                    guitars.set(i, temp);
                }
            }
        }*/

        for (int i = 0; i < guitarSize; i++) {
            System.out.println(guitars.get(i));
        }
    }
}
