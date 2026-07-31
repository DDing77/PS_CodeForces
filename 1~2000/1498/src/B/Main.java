package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private int w;
    private int[] count;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            count = new int[31];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                int width = Integer.parseInt(st.nextToken());
                int bit = Integer.numberOfTrailingZeros(width);

                count[bit]++;
            }

            int remainingRectangleCount = n;
            int height = 0;

            while (remainingRectangleCount > 0) {
                int remainingWidth = w;

                for (int bit = 30; bit >= 0; bit--) {
                    if (count[bit] == 0) {
                        continue;
                    }

                    int rectangleWidth = 1 << bit;
                    int possibleCount = remainingWidth / rectangleWidth;
                    int useCount = Math.min(count[bit], possibleCount);

                    count[bit] -= useCount;
                    remainingRectangleCount -= useCount;
                    remainingWidth -= useCount * rectangleWidth;
                }

                height++;
            }

            sb.append(height).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}