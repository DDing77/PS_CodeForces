import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            input = br.readLine();
            if (input.length() <= 10) sb.append(input).append('\n');
            else
                sb.append(input.charAt(0)).append(input.length() - 2).append(input.charAt(input.length() - 1)).append('\n');
        }

        System.out.print(sb);
    }
}
