package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int count = 0;
            boolean hasThree = false;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    count++;
                }

                if (i >= 2
                        && s.charAt(i) == '.'
                        && s.charAt(i - 1) == '.'
                        && s.charAt(i - 2) == '.') {
                    hasThree = true;
                }
            }

            sb.append(hasThree ? 2 : count).append('\n');
        }

        System.out.print(sb);
    }
}