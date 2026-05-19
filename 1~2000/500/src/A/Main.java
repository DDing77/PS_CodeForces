package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int k;
    private int[] a;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int curIdx = 1;
        while (curIdx < n) {
            int nextIdx = curIdx + a[curIdx];
            if (nextIdx == k) {
                System.out.println("YES");
                return;
            }
            curIdx = nextIdx;
        }

        System.out.println("NO");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
