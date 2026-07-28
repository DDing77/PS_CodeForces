package H;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private int k;
    private int[] a;
    private int[] cntArr;
    private long res;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            cntArr = new int[31];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= 30; j++) {
                    if ((a[i] & (1 << j)) == 0) {
                        cntArr[j]++;
                    }
                }
            }

            res = 0L;

            for (int bit = 30; bit >= 0; bit--) {
                if (k >= cntArr[bit]) {
                    res |= (1L << bit);
                    k -= cntArr[bit];
                }
            }
            sb.append(res).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
