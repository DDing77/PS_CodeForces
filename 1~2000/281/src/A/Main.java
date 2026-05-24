package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solution() throws IOException {
        String word = br.readLine();

        char first = Character.toUpperCase(word.charAt(0));

        System.out.println(first + word.substring(1));
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}