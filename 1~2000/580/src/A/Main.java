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
    private int[] a;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int resMaxLength = 0;
        int curLength = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] >= a[i - 1]) {
                curLength++;
                resMaxLength = Math.max(resMaxLength, curLength);
            } else {
                curLength = 1;
            }
        }

        System.out.println(resMaxLength);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
