package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int year;

    private boolean isBeautiful(int year) {
        boolean[] used = new boolean[10];

        while (year > 0) {
            int digit = year % 10;

            if (used[digit]) {
                return false;
            }

            used[digit] = true;
            year /= 10;
        }

        return true;
    }

    private void solution() throws IOException {
        year = Integer.parseInt(br.readLine());

        while (true) {
            year++;
            if (isBeautiful(year)) {
                System.out.println(year);
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

