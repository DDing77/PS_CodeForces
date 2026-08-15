package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    private String str;

    private void solution() throws IOException {
        str = br.readLine();

        boolean flag = true;

        for (int i = 1; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            System.out.println(str);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
