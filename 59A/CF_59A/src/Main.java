import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String input;
    static int uppers, lowers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        uppers = 0;
        lowers = 0;

        input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);
            if ('A' <= cur && cur <= 'Z') uppers++;
            else lowers++;
        }

        if (lowers >= uppers) System.out.println(input.toLowerCase());
        else System.out.println(input.toUpperCase());
    }
}
