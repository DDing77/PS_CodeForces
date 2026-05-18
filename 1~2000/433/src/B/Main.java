package B;

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
    private int[] v;
    private int[] ordered;
    private long[] sumV;
    private long[] sumOrdered;
    private int m;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        v = new int[n + 1];
        ordered = new int[n + 1];
        sumV = new long[n + 1];
        sumOrdered = new long[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            v[i] = Integer.parseInt(st.nextToken());
            ordered[i] = v[i];
        }

        Arrays.sort(ordered);

        for (int i = 1; i <= n; i++) {
            sumV[i] = v[i] + sumV[i - 1];
            sumOrdered[i] = ordered[i] + sumOrdered[i - 1];
        }

        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (type == 1) {
                sb.append(sumV[r] - sumV[l - 1]);
            } else {
                sb.append(sumOrdered[r] - sumOrdered[l - 1]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
