package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private void solution() throws IOException {
        String input = br.readLine();

        HashSet<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (c != '{' && c != '}' && c != ' ' && c != ',') {
                set.add(c);
            }
        }

        System.out.println(set.size());
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
