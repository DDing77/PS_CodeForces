package C;

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
    private int q;
    private int[] arr;
    private int[] diff;
    private long[] cnt;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        arr = new int[n];
        diff = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken()) - 1;

            diff[l]++;
            diff[r + 1]--;
        }

        cnt = new long[n];
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            cnt[i] = sum;
        }

        Arrays.sort(arr);
        Arrays.sort(cnt);

        long res = 0L;
        for (int i = 0; i < n; i++) {
            res += (long) cnt[i] * arr[i];
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
