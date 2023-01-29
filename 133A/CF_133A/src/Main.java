import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();

        if (input.contains("H") || input.contains("Q") || input.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
