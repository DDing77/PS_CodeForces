package C;

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
            long res = 0L;

            st = new StringTokenizer(br.readLine());
            int maxValue = Integer.parseInt(st.nextToken());

            for (int i = 1; i < n; i++) {
                int curValue = Integer.parseInt(st.nextToken());
                if ((maxValue > 0 && curValue > 0) || (maxValue < 0 && curValue < 0)) {
                    maxValue = Math.max(maxValue, curValue);
                } else {
                    res += maxValue;
                    maxValue = curValue;
                }
            }
            res += maxValue;
            sb.append(res).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
