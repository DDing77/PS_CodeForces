package E;

import java.io.*;
import java.util.*;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private int s;
    private int[] a;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());

            a = new int[n];

            st = new StringTokenizer(br.readLine());

            int total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                total += a[i];
            }

            if (total < s) {
                sb.append(-1).append('\n');
                continue;
            }

            int left = 0;
            int sum = 0;
            int maxLength = -1;

            for (int right = 0; right < n; right++) {
                sum += a[right];

                while (sum > s) {
                    sum -= a[left];
                    left++;
                }

                if (sum == s) {
                    maxLength = Math.max(maxLength, right - left + 1);
                }
            }

            sb.append(n - maxLength).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}