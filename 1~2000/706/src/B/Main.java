package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private static final int MAX_LENGTH = 100_000;

    private int[] count = new int[MAX_LENGTH + 1];
    private int n;
    private int q;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(st.nextToken())]++;
        }

        for (int i = 1; i <= MAX_LENGTH; i++) {
            count[i] += count[i - 1];
        }

        q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m > MAX_LENGTH) {
                sb.append(n).append("\n");
            } else {
                sb.append(count[m]).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
