package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private static final int MAX = 1000001;

    private int n;
    private boolean[] primes;
    private HashSet<Long> primeSet = new HashSet<>();

    private void init() {
        primes = new boolean[MAX];

        for (int i = 2; i * i < MAX; i++) {
            if (!primes[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i < MAX; i++) {
            if (!primes[i]) {
                primeSet.add((long) i * i);
            }
        }
    }

    private void solution() throws IOException {
        init();

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(st.nextToken());
            if (primeSet.contains(num)) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
