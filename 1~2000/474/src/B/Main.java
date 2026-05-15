package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int[] a;
    private int[] prefixSum;
    private int m;

    private int getPos(int q) {
        int left = 0;
        int right = n;
        while (left + 1 < right) {
            int mid = (left + right) >> 1;
            if (prefixSum[mid] >= q) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return right;
    }

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new int[n + 1];
        prefixSum = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (m-- > 0) {
            int q = Integer.parseInt(st.nextToken());
            sb.append(getPos(q)).append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
