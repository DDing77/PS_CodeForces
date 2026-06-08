package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int maxRes;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        maxRes = 0;

        int cur = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            cur -= a;
            cur += b;
            maxRes = Math.max(maxRes, cur);
        }

        System.out.println(maxRes   );
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
