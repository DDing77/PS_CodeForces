package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    public static final StringBuilder sb = new StringBuilder();

    public static StringTokenizer st;

    private int t;
    private int n;
    private int[] a;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            a = new int[n];

            st = new StringTokenizer(br.readLine());

            int totalXor = 0;

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                totalXor ^= a[i];
            }

            if (totalXor == 0) {
                sb.append("YES").append('\n');
                continue;
            }

            int currentXor = 0;
            int sectionCount = 0;

            for (int i = 0; i < n; i++) {
                currentXor ^= a[i];

                if (currentXor == totalXor) {
                    sectionCount++;
                    currentXor = 0;
                }
            }

            if (sectionCount >= 3) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}