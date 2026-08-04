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
    private long[] a;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            long k = 2;

            while (true) {
                long remainder = a[0] % k;
                boolean isAllSame = true;

                for (int i = 1; i < n; i++) {
                    if (remainder != a[i] % k) {
                        isAllSame = false;
                        break;
                    }
                }

                if (!isAllSame) {
                    sb.append(k).append("\n");
                    break;
                }

                k *= 2;
            }
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
