import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private String word;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            word = br.readLine();
            if (word.length() > 10) {
                sb.append(word.charAt(0)).append(word.length() - 2).append(word.charAt(word.length() - 1));
            } else {
                sb.append(word);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
