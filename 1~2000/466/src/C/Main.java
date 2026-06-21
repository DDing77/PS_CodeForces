package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int[] a;
    private long res;
    
    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new int[n];

        long total = 0L;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            total += a[i];
        }

        if (total % 3 != 0) {
            System.out.println(0);
            return;
        }

        long target = total / 3;
        long prefix = 0L;
        long firstCnt = 0L;

        for (int i = 0; i < n - 1; i++) {
            prefix += a[i];

            if (prefix == target * 2) {
                res += firstCnt;
            }

            if (prefix == target) {
                firstCnt++;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
