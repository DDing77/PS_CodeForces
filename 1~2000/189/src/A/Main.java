package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int a;
    private int b;
    private int c;
    private int[][] dp;
    private int resMax;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int length1 = n / a;
        int length2 = n / b;
        dp = new int[length1 + 1][length2 + 1];

        for (int i = 0; i <= length1; i++) {
            for (int j = 0; j <= length2; j++) {
                int remain = n - (a * i + b * j);
                if (remain >= 0 && remain % c == 0) {
                    dp[i][j] = remain / c + i + j;
                    resMax = Math.max(resMax, dp[i][j]);
                }
            }
        }

        System.out.println(resMax);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
