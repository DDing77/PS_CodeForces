package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solution() throws IOException {
        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';
            int inverted = 9 - digit;

            if (i == 0 && digit == 9) {
                continue;
            }

            if (inverted < digit) {
                arr[i] = (char) (inverted + '0');
            }
        }

        System.out.println(new String(arr));
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}