package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private String n;
    private int cnt;

    private void solution() throws IOException {
        n = br.readLine();
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '4' || c == '7') {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("NO");
            return;
        }

        while (cnt > 0) {
            int r = cnt % 10;
            if (!(r == 4 || r == 7)) {
                System.out.println("NO");
                return;
            }
            cnt /= 10;
        }

        System.out.println("YES");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
