import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        input = br.readLine();

        input = input.replaceAll("[AOYEUIaoyeui]", "");
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            sb.append(".");
            sb.append(input.charAt(i));
        }

        System.out.println(sb);
    }
}
