package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String str;
    private ArrayList<Character> letters = new ArrayList<>();

    private void solution() throws IOException {
        str = br.readLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a'
                    || c == 'o'
                    || c == 'y'
                    || c == 'e'
                    || c == 'u'
                    || c == 'i') {
                continue;
            }
            letters.add(c);
        }

        for (Character c : letters) {
            sb.append('.').append(c);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
