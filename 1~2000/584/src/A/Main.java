package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int t;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        if (t < 10) {
            for (int i = 0; i < n; i++) {
                sb.append(t);
            }
            System.out.println(sb);
        } else {
            if (n == 1) {
                System.out.println(-1);
            } else {
                sb.append(10);
                for (int i = 0; i < n - 2; i++) {
                    sb.append(0);
                }
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

