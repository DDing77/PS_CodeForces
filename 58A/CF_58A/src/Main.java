import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();

        String str = "hello";

        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == str.charAt(j)) {
                j++;
            }

            if (j == 5) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
