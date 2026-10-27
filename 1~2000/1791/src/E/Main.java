package E;

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
            long negativeCnt = 0;
            long absSum = 0;
            long minAbs = Long.MAX_VALUE;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(st.nextToken());
                if (a < 0) {
                    negativeCnt++;
                }
                absSum += Math.abs(a);
                minAbs = Math.min(minAbs, Math.abs(a));
            }

            if (negativeCnt % 2 == 0) {
                sb.append(absSum);
            } else {
                sb.append(absSum - 2 * minAbs);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

