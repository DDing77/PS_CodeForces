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
    private int m;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long globalMin = Integer.MAX_VALUE;
            long smallestSecondMin = Long.MAX_VALUE;
            long secondMinSum = 0L;

            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                m = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());

                long min1 = Long.MAX_VALUE;
                long min2 = Long.MAX_VALUE;

                for (int j = 0; j < m; j++) {
                    long value = Long.parseLong(st.nextToken());

                    if (value < min1) {
                        min2 = min1;
                        min1 = value;
                    } else if (value < min2) {
                        min2 = value;
                    }
                }
                globalMin = Math.min(globalMin, min1);
                smallestSecondMin = Math.min(smallestSecondMin, min2);
                secondMinSum += min2;
            }

            sb.append(secondMinSum + globalMin - smallestSecondMin).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
