package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int a;
    private int b;
    private int c;
    private int maxValue;

    private void solution() throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        maxValue = a + b + c;
        maxValue = Math.max(maxValue, a * (b + c));
        maxValue = Math.max(maxValue, (a + b) * c);
        maxValue = Math.max(maxValue, a * b * c);

        System.out.println(maxValue);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
