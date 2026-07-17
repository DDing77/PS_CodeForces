package B;

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
    private int[] msbCnt;
    private long res;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            msbCnt = new int[30];
            res = 0L;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(st.nextToken());
                int bit = 31 - Integer.numberOfLeadingZeros(number);
                res += msbCnt[bit];
                msbCnt[bit]++;
            }

            sb.append(res + "\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
