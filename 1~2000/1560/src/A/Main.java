package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private static final int[] likeEle = new int[1000];
    private int t;

    private void solution() throws IOException {
        init();

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(likeEle[n - 1]).append('\n');
        }
        System.out.print(sb);
    }

    private void init() {
        int idx = 0;
        int cur = 1;
        while (idx < 1000) {
            if (!(cur % 3 == 0 || cur % 10 == 3)) {
                likeEle[idx++] = cur;
            }
            cur++;
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
