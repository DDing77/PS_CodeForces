package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private static final int[] dollars = {
            100, 20, 10, 5, 1
    };

    private int n;
    private int res;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int dollar : dollars) {
            int q = n / dollar;
            res += q;
            n -= q * dollar;
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
