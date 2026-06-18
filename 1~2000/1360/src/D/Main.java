package D;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int answer = n;

            for (int i = 1; i * i <= n; i++) {
                if (n % i != 0) {
                    continue;
                }

                int divisor1 = i;
                int divisor2 = n / i;

                if (divisor1 <= k) {
                    answer = Math.min(answer, n / divisor1);
                }

                if (divisor2 <= k) {
                    answer = Math.min(answer, n / divisor2);
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}