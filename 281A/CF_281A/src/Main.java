import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = br.readLine();

        String first = input.substring(0, 1).toUpperCase();
        String second = input.substring(1);

        System.out.println(first + second);
    }
}
