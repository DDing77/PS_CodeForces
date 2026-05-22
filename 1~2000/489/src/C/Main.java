package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int m;
    private int s;
    private int[] min;
    private int[] max;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        if ((m > 1 && s == 0) || s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }

        if (m == 1 && s == 0) {
            System.out.println("0 0");
            return;
        }

        min = new int[m];
        min[0] = 1;
        int sum = s - 1;
        for (int i = m - 1; i >= 0; i--) {
            int add = Math.min(9 - min[i], sum);
            min[i] += add;
            sum -= add;
        }

        max = new int[m];
        sum = s;
        for (int i = 0; i < m; i++) {
            int add = Math.min(9, sum);
            max[i] = add;
            sum -= add;
        }

        for (int num : min) {
            sb.append(num);
        }
        sb.append(" ");

        for (int num : max) {
            sb.append(num);
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
