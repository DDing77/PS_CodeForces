import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static Set<Character> letters;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        letters = new HashSet<>();

        input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                letters.add(ch);
            }
        }

        System.out.println(letters.size());
    }
}
