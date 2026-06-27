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

    private int n;
    private int[] coins;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        coins = new int[n];

        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
            sum += coins[i];
        }

        Arrays.sort(coins);
        int curSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            curSum += coins[i];
            sum -= coins[i];
            if (curSum > sum) {
                System.out.println(n - i);
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
