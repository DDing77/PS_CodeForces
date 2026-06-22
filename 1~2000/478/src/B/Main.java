package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private long n;
    private long m;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        m = Long.parseLong(st.nextToken());

        //max
        long big = n - (m - 1);
        long max = big * (big - 1) / 2;

        //min
        long q = n / m;
        long r = n % m;
        long min = r * (q + 1) * q / 2
                + (m - r) * q * (q - 1) / 2;

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
