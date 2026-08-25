package E;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private Set<Long> set = new HashSet<Long>();

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            set.clear();
            set.add(0L);
            long prefixSum = 0L;
            boolean possible = false;

            n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                long val = Long.parseLong(st.nextToken());

                if ((i & 1) != 1) {
                    prefixSum -= val;
                } else {
                    prefixSum += val;
                }

                if (set.contains(prefixSum)) {
                    possible = true;
                    break;
                }
                set.add(prefixSum);
            }
            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
