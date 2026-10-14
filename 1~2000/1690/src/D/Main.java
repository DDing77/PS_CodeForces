package D;

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
    private char[] cells;
    private int resMin;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            cells = br.readLine().toCharArray();
            int bCnt = 0;
            for (int i = 0; i < k; i++) {
                if (cells[i] == 'B') {
                    bCnt++;
                }
            }

            resMin = Integer.MAX_VALUE;
            int idx = k - 1;

            while (true) {
                int wCnt = k - bCnt;
                resMin = Math.min(resMin, wCnt);

                if (wCnt == 0) {
                    break;
                }

                if (cells[idx - k + 1] == 'B') {
                    bCnt--;
                }

                idx++;
                if (idx == n) {
                    break;
                }

                if (cells[idx] == 'B') {
                    bCnt++;
                }
            }

            sb.append(resMin).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
