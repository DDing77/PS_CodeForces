package C;

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
    private long k;

    private long[] a;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(a);

        int mid = n / 2;
        long res = a[mid];

        for (int i = mid; i < n - 1; i++) {
            long cnt = i - mid + 1L;
            long diff = a[i + 1] - a[i];
            long cost = diff * cnt;

            if (cost <= k) {
                k -= cost;
                res = a[i + 1];
            } else {
                res = a[i] + k / cnt;
                k = 0;
                break;
            }
        }

        if (k > 0) {
            long cnt = n - mid;
            res += k / cnt;
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
