package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private String a;
    private String b;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();

            sb.append(b.charAt(0)).append(a.substring(1)).append(' ').append(a.charAt(0)).append(b.substring(1)).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

