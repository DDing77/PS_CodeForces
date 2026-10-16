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
    private int m;
    private int[] a;
    private int[] distinct;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        distinct = new int[n + 1];
        boolean[] visited = new boolean[100001];

        for (int i = n; i >= 1; i--) {
            if (!visited[a[i]]) {
                visited[a[i]] = true;
                cnt++;
            }

            distinct[i] = cnt;
        }

        for (int i = 0; i < m; i++) {
            int l = Integer.parseInt(br.readLine());

            sb.append(distinct[l]).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
