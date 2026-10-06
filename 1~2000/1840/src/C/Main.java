package C;

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
    private int k;
    private int q;
    private long res;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());

            long cnt = 0;
            res = 0L;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a <= q) {
                    cnt++;
                } else {
                    if (cnt >= k) {
                        res += (cnt - k + 1) * (cnt - k + 2) / 2;
                    }
                    cnt = 0;
                }
            }
            if (cnt >= k) {
                res += (cnt - k + 1) * (cnt - k + 2) / 2;
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

