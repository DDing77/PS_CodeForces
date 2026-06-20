package C;

import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int size = n * (n - 1) / 2;

            int[] b = new int[size];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);

            int index = 0;

            for (int count = n - 1; count >= 1; count--) {
                sb.append(b[index]).append(' ');
                index += count;
            }

            sb.append(1_000_000_000).append('\n');
        }

        System.out.print(sb);
    }
}