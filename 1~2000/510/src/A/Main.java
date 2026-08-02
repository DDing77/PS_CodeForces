package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder all = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    all.append('#');
                }
            } else if (i % 4 == 2) {
                for (int j = 0; j < m - 1; j++) {
                    all.append('.');
                }
                all.append('#');
            } else {
                all.append('#');
                for (int j = 0; j < m - 1; j++) {
                    all.append('.');
                }
            }

            all.append('\n');
        }

        System.out.print(all);
    }
}