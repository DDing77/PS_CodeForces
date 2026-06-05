package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String A;
    private String B;

    private void solution() throws IOException {
        A = br.readLine();
        B = br.readLine();

        if (A.length() != B.length()) {
            System.out.println("NO");
            return;
        }

        int len = A.length();

        for (int i = 0; i < len; i++) {
            if (A.charAt(i) != B.charAt(len - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
