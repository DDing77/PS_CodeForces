import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private final String origin = "codeforces";
    private int t;
    private String input;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            input = br.readLine();

            int cnt = 0;
            for (int i = 0; i < 10; i++) {
                if (input.charAt(i) != origin.charAt(i)) {
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
