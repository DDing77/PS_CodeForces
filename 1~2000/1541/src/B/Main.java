package B;

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
    private int[] a;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            a = new int[n + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int answer = 0;

            for (int i = 1; i <= n; i++) {
                for (int sum = a[i]; sum <= 2 * n; sum += a[i]) {
                    int j = sum - i;

                    if (j <= i || j > n) {
                        continue;
                    }

                    if (a[j] == sum / a[i]) {
                        answer++;
                    }
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}