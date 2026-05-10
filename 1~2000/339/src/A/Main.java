package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String str;
    private ArrayList<Character> charsList = new ArrayList<>();

    private void solution() throws IOException {
        str = br.readLine();
        for (char c : str.toCharArray()) {
            if (c != '+') {
                charsList.add(c);
            }
        }

        Collections.sort(charsList);

        for (int i = 0; i < charsList.size(); i++) {
            if (i != 0) {
                sb.append('+');
            }
            sb.append(charsList.get(i));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
