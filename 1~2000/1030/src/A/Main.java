package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    private void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int opinion = Integer.parseInt(st.nextToken());

            if (opinion == 1) {
                System.out.println("HARD");
                return;
            }
        }

        System.out.println("EASY");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}