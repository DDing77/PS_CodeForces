package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private int x;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            int max = 0;
            int pre = 0;
            int a = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a = Integer.parseInt(st.nextToken());
                if (i == 0) {
                    max = a;
                } else {
                    max = Math.max(max, a - pre);
                }
                pre = a;
            }

            max = Math.max(max, (x - pre) * 2);
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
