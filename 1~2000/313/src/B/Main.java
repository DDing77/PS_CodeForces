package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private char[] input;
    private int[] dp;
    private int m;
    private int l;
    private int r;

    private void solution() throws IOException {
        input = br.readLine().toCharArray();
        dp = new int[input.length];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1];
            if (input[i - 1] == input[i]) {
                dp[i]++;
            }
        }

        m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken()) - 1;
            r = Integer.parseInt(st.nextToken()) - 1;

            sb.append(dp[r] - dp[l]).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
