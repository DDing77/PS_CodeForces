package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private static final int[] RATING_ARR = {
            1900, 1600, 1400, -5000
    };

    private static final String[] DIVISION_ARR = {
            "Division 1", "Division 2", "Division 3", "Division 4"
    };

    private int t;
    private int rating;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            rating = Integer.parseInt(br.readLine());
            for (int i = 0; i < RATING_ARR.length; i++) {
                if (rating >= RATING_ARR[i]) {
                    sb.append(DIVISION_ARR[i]).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
