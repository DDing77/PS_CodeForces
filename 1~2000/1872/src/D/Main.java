package D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private long n;
    private long x;
    private long y;

    private long getGCD(long a, long b) {
        if (a % b != 0) {
            return getGCD(b, a % b);
        }
        return b;
    }

    private long getLCM(long a, long b) {
        long gcd = getGCD(a, b);
        return a / gcd * b;
    }

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Long.parseLong(st.nextToken());
            x = Long.parseLong(st.nextToken());
            y = Long.parseLong(st.nextToken());

            long lcm = getLCM(x, y);

            long minusRange = n / y - n / lcm;
            long plusRange = n / x - n / lcm;

            long plusSum = n * (n + 1) / 2
                    - (n - plusRange) * (n - plusRange + 1) / 2;

            long minusSum = minusRange * (minusRange + 1) / 2;

            sb.append(plusSum - minusSum).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}