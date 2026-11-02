package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    private void solution() throws IOException {
        String s = br.readLine();

        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                sb.append('0');
                i++;
            } else {
                if (s.charAt(i + 1) == '.') {
                    sb.append('1');
                } else {
                    sb.append('2');
                }
                i += 2;
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
