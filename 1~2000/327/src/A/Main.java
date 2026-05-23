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
    private int resMax;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int curMax = 0;
        int oneCnt = 0;
        resMax = -1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            int gain;
            if (num == 0) {
                gain = 1;
            } else {
                oneCnt++;
                gain = -1;
            }

            curMax = Math.max(gain, curMax + gain);
            resMax = Math.max(resMax, curMax);
        }

        System.out.println(oneCnt + resMax);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
