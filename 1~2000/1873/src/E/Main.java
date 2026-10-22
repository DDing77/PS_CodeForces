package E;

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
    private int x;
    private int[] a;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            int aMax = 0;

            a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                aMax = Math.max(aMax, a[i]);
            }

            long left = 1;
            long right = (long) x + aMax + 1;
            while (left + 1 < right) {
                long h = (left + right) >> 1;
                long sum = 0L;
                for (int i = 0; i < n; i++) {
                    sum += Math.max(0, h - a[i]);
                    if (sum > x) {
                        break;
                    }
                }

                if (sum <= x) {
                    left = h;
                } else {
                    right = h;
                }
            }

            sb.append(left).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

