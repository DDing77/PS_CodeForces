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

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            int oddCnt = 0;
            while (st.hasMoreTokens()) {
                int element = Integer.parseInt(st.nextToken());
                if (element % 2 == 1) {
                    oddCnt++;
                }
            }

            if (oddCnt % 2 == 1) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
