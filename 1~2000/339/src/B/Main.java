package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int m;
    private long res;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        res = 0L;
        int cur = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int next = Integer.parseInt(st.nextToken());

            if (cur > next) {
                res += (next + n) - cur;
            } else {
                res += (next - cur);
            }
            cur = next;
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
