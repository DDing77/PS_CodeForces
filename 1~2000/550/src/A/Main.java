package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        boolean possible = false;

        // AB -> BA
        int ab = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (ab == -1 && s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') {
                ab = i;
            }

            if (ab != -1
                    && i >= ab + 2
                    && s.charAt(i) == 'B'
                    && s.charAt(i + 1) == 'A') {
                possible = true;
                break;
            }
        }

        // BA -> AB
        if (!possible) {
            int ba = -1;

            for (int i = 0; i < s.length() - 1; i++) {
                if (ba == -1 && s.charAt(i) == 'B' && s.charAt(i + 1) == 'A') {
                    ba = i;
                }

                if (ba != -1
                        && i >= ba + 2
                        && s.charAt(i) == 'A'
                        && s.charAt(i + 1) == 'B') {
                    possible = true;
                    break;
                }
            }
        }

        System.out.println(possible ? "YES" : "NO");
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}