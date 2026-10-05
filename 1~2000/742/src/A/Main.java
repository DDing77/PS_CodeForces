package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private static final int[] R = {6, 8, 4, 2};
    private int n;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(R[n % 4]);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
