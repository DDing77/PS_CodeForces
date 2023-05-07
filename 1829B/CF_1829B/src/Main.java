import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private int t;
    private int n;
    private int[] a;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int min = 0;
            int idx = 0;
            int cnt = 0;
            while (idx < n) {
                cnt = 0;
                boolean flag = false;
                while (idx < n && a[idx] == 0) {
                    cnt++;
                    idx++;
                    flag = true;
                }

                if (!flag) {
                    idx++;
                }
                min = Math.max(min, cnt);
            }
            sb.append(min).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
