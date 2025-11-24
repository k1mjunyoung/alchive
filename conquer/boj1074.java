package conquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1074 Z
 * 분할정복, 재귀
 */
public class boj1074_k1mjunyoung {
    static int size = 1;
    static int N, R, C;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        size = (int) Math.pow(2, N);

        int count = 0;
        int x = 0;
        int y = 0;

        while(size > 0) {
            size /= 2;
            if(R < x+size && C < y+size) {
                count += 0;
            }
            else if(R < x+size) {
                count += size * size;
                y += size;
            }
            else if (C < y+size) {
                count += size * size * 2;
                x += size;
            }
            else {
                count += size * size * 3;
                x += size;
                y += size;
            }

            // size가 1이 되면 종료.
            if(size == 1) {
                System.out.println(count);
                break;
            }
        }
    }
}
