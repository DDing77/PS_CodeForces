import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private int t;
    private int n;
    private long[][] a;
    private long[] dp;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        a = new long[1500][1500];
        dp = new long[2000007];
        long cur = 1;

        for (int i = 1; i < 1500; i++) {
            for (int j = i - 1; j >= 1; j--) {
                a[j][i - j] = a[j - 1][i - j] + a[j][i - j - 1] - a[j - 1][i - j - 1] + cur * cur;
                dp[(int) cur++] = a[j][i - j];
            }
        }

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
