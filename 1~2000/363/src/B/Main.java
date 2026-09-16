package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int k;
    private int[] dp;
    
    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        dp = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + Integer.parseInt(st.nextToken());
        }

        int resIdx = -1;
        int resMin = Integer.MAX_VALUE;
        for (int i = k; i <= n; i++) {
            if (dp[i] - dp[i - k] < resMin) {
                resMin = dp[i] - dp[i - k];
                resIdx = i - k + 1;
            }
        }
        System.out.println(resIdx);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

