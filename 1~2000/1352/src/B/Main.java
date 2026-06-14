package B;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (n >= k && n % 2 == k % 2) {
                sb.append("YES\n");

                for (int i = 0; i < k - 1; i++) {
                    sb.append(1).append(' ');
                }

                sb.append(n - (k - 1)).append('\n');
            } else if (n >= 2L * k && n % 2 == 0) {
                sb.append("YES\n");

                for (int i = 0; i < k - 1; i++) {
                    sb.append(2).append(' ');
                }

                sb.append(n - 2L * (k - 1)).append('\n');
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}