package A;

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
    private int x;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            int oddCnt = 0;
            int evenCnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    evenCnt++;
                } else {
                    oddCnt++;
                }
            }

            boolean isPossible = false;
            for (int oddPick = 1; oddPick <= x; oddPick += 2) {
                int evenPick = x - oddPick;
                if (oddPick <= oddCnt && evenPick <= evenCnt) {
                    isPossible = true;
                    break;
                }
            }

            if (isPossible) {
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
