package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private static final int INF = 1_000_000_000;

    private int n;
    private int[] a;
    private int[][] dp;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());

        a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[n + 1][3];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }

        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.min(dp[i - 1][0], Math.min(dp[i - 1][1], dp[i - 1][2])) + 1;

            if (a[i] == 1 || a[i] == 3) {
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]);
            }

            if (a[i] == 2 || a[i] == 3) {
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
        }

        int res = Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
