package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    private void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long minCnt = 0;
        long maxCnt = 0;

        for (int i = 0; i < n; i++) {
            long b = Long.parseLong(st.nextToken());

            if (b < min) {
                min = b;
                minCnt = 1;
            } else if (b == min) {
                minCnt++;
            }

            if (b > max) {
                max = b;
                maxCnt = 1;
            } else if (b == max) {
                maxCnt++;
            }
        }

        long maxDiff = max - min;
        long count;

        if (maxDiff == 0) {
            count = (long) n * (n - 1) / 2;
        } else {
            count = minCnt * maxCnt;
        }

        System.out.println(maxDiff + " " + count);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}