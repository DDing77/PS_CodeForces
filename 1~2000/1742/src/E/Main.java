package E;

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
    private int q;
    private long[] prefixSum;
    private long[] prefixMax;

    private int binarySearch(int k) {
        int left = -1;
        int right = n;
        while (left + 1 < right) {
            int mid = (left + right) >> 1;
            if (k >= prefixMax[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());

            prefixSum = new long[n];
            prefixMax = new long[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                long height = Long.parseLong(st.nextToken());
                if (i == 0) {
                    prefixSum[i] = height;
                    prefixMax[i] = height;
                    continue;
                }
                prefixSum[i] = prefixSum[i - 1] + height;
                prefixMax[i] = Math.max(prefixMax[i - 1], height);
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < q; i++) {
                int k = Integer.parseInt(st.nextToken());
                int idx = binarySearch(k);
                if (idx == -1) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(prefixSum[idx]).append(" ");
                }
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
