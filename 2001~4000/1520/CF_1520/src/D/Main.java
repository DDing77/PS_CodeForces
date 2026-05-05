package D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private HashMap<Integer, Long> map = new HashMap<>();
    private long res;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            res = 0L;
            map.clear();

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int a = Integer.parseInt(st.nextToken());

                int key = a - i;

                long cnt = map.getOrDefault(key, 0L);

                res += cnt;

                map.put(key, cnt + 1);
            }

            sb.append(res).append("\n");
        }
        System.out.print(sb);

    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
