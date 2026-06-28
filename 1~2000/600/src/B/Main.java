package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int m;
    private int[] a;

    private int getLessOrEqualCount(int number) {
        int left = -1;
        int right = n;
        while (left + 1 < right) {
            int mid = (left + right) >> 1;
            if (a[mid] > number) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left + 1;
    }

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(st.nextToken());
            sb.append(getLessOrEqualCount(number)).append(" ");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
