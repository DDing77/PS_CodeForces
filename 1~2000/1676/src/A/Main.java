package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;
    private char[] ticket;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ticket = br.readLine().toCharArray();
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < ticket.length / 2; i++) {
                leftSum += ticket[i] - '0';
            }
            for (int i = ticket.length / 2; i < ticket.length; i++) {
                rightSum += ticket[i] - '0';
            }

            if (leftSum == rightSum) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
