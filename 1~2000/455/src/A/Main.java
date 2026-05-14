package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private static final int LENGTH = 100001;
    private int n;
    private int[] counts;
    private long[] dp;
    private long resMax;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        counts = new int[LENGTH];
        dp = new long[LENGTH];

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            counts[num]++;
        }

        dp[1] = counts[1];
        resMax = dp[1];
        for (int i = 2; i < LENGTH; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * (long) counts[i]);
            resMax = Math.max(resMax, dp[i]);
        }

        System.out.println(resMax);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
