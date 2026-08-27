package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private long[][] a;
    private long[][] dp;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new long[2][n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[0][i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[1][i] = Long.parseLong(st.nextToken());
        }

        dp = new long[2][n + 1];
        dp[0][1] = a[0][1];
        dp[1][1] = a[1][1];

        for (int i = 2; i <= n; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], a[0][i] + dp[1][i - 1]);
            dp[1][i] = Math.max(dp[1][i - 1], a[1][i] + dp[0][i - 1]);
        }

        System.out.println(Math.max(dp[0][n], dp[1][n]));
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

