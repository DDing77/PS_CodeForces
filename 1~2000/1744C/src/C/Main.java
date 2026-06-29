package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;

    private int t;
    private int n;
    private char c;
    private String s;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            c = st.nextToken().charAt(0);

            s = br.readLine();

            if (c == 'g') {
                sb.append(0).append('\n');
                continue;
            }

            String doubled = s + s;
            int nextGreen = -1;
            int answer = 0;

            for (int i = doubled.length() - 1; i >= 0; i--) {
                if (doubled.charAt(i) == 'g') {
                    nextGreen = i;
                }

                if (i < n && doubled.charAt(i) == c) {
                    answer = Math.max(answer, nextGreen - i);
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}