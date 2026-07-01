package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    private String recipe;

    private long nb;
    private long ns;
    private long nc;

    private long pb;
    private long ps;
    private long pc;

    private long r;

    private long needB;
    private long needS;
    private long needC;

    private boolean canMake(long count) {
        long buyB = Math.max(0, needB * count - nb);
        long buyS = Math.max(0, needS * count - ns);
        long buyC = Math.max(0, needC * count - nc);

        long cost = buyB * pb + buyS * ps + buyC * pc;

        return cost <= r;
    }

    private void solution() throws IOException {
        recipe = br.readLine();

        for (int i = 0; i < recipe.length(); i++) {
            char ch = recipe.charAt(i);

            if (ch == 'B') {
                needB++;
            } else if (ch == 'S') {
                needS++;
            } else {
                needC++;
            }
        }

        st = new StringTokenizer(br.readLine());
        nb = Long.parseLong(st.nextToken());
        ns = Long.parseLong(st.nextToken());
        nc = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        pb = Long.parseLong(st.nextToken());
        ps = Long.parseLong(st.nextToken());
        pc = Long.parseLong(st.nextToken());

        r = Long.parseLong(br.readLine());

        long left = 0;
        long right = 1_000_000_000_000L + 1000;

        while (left + 1 < right) {
            long mid = (left + right) / 2;

            if (canMake(mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.println(left);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}