package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    private long n;
    private long k;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());

        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            long evenIndex = k - oddCount;
            System.out.println(2 * evenIndex);
        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
