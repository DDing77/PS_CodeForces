package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int a = -1;
            int b = -1;
            int c = -1;

            int temp = n;
            for (int i = 2; i * i <= temp; i++) {
                if (temp % i == 0) {
                    a = i;
                    temp /= i;
                    break;
                }
            }

            if (a == -1) {
                sb.append("NO").append("\n");
                continue;
            }

            for (int i = a + 1; i * i <= temp; i++) {
                if (temp % i == 0) {
                    b = i;
                    temp /= i;
                    break;
                }
            }

            c = temp;

            if (b == -1 || c == a || c == b || c < 2) {
                sb.append("NO").append("\n");
            } else {
                sb.append("YES").append("\n");
                sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
