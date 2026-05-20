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

    private int n;
    private int[] a;
    private int m;
    private int[] b;
    private int[][] dp;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a, 1, n + 1);

        m = Integer.parseInt(br.readLine());
        b = new int[m + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b, 1, m + 1);

        dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                if (Math.abs(a[i] - b[j]) <= 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
            }
        }

        System.out.println(dp[n][m]);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
