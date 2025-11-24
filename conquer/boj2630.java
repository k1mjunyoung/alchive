package conquer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj2630_k1mjunyoung {
    static int white = 0;
    static int blue = 0;
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        bw.write(String.valueOf(white));
        bw.write("\n");
        bw.write(String.valueOf(blue));
        bw.flush();
        bw.close();
    }

    static void partition(int row, int col, int size) {
        if (isAllSameColor(row, col, size)) {
            if (paper[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }

        int halfSize = size / 2;

        partition(row, col, halfSize); // 2사분면
        partition(row, col + halfSize, halfSize); // 1사분면
        partition(row + halfSize, col, halfSize); // 3사분면
        partition(row + halfSize, col + halfSize, halfSize); // 4사분면
    }



    static boolean isAllSameColor(int row, int col, int size) {
        int color = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
