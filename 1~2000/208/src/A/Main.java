package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String input;

    private void solution() throws IOException {
        input = br.readLine();

        input = input.replaceAll("WUB", " ");
        input = input.trim();

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                sb.append(chars[i]);
                continue;
            }
            if (chars[i] == ' ' && chars[i - 1] != ' ') {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
