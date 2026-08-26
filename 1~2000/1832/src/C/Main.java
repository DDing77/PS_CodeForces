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
    private int[] a;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            if (n == 1) {
                sb.append(1).append("\n");
                continue;
            }

            a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int resCnt = 2;
            int preDir = 0;

            for (int i = 1; i < n; i++) {
                int curDir;

                if (a[i] > a[i - 1]) {
                    curDir = 1;
                } else if (a[i] < a[i - 1]) {
                    curDir = -1;
                } else {
                    continue;
                }

                if (preDir != 0 && preDir != curDir) {
                    resCnt++;
                }

                preDir = curDir;
            }

            if (preDir == 0) {
                resCnt = 1;
            }

            sb.append(resCnt).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

