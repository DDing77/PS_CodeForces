package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String word;

    private void solution() throws IOException {
        word = br.readLine();

        int lowerCnt = 0;
        int upperCnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCnt++;
            } else {
                lowerCnt++;
            }
        }

        if (lowerCnt >= upperCnt) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toUpperCase());
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
