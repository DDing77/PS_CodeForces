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
    private int resCnt;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = min;

        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if (val < min) {
                min = val;
                resCnt++;
            } else if (val > max) {
                max = val;
                resCnt++;
            }
        }

        System.out.println(resCnt);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
