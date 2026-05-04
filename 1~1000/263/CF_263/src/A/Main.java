package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private static final int LENGTH = 5;

    private void solution() throws IOException {
        for (int i = 0; i < LENGTH; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < LENGTH; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) {
                    System.out.println(Math.abs(2 - i) + Math.abs(2 - j));
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
