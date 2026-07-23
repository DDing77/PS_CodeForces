package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());

        int x3;
        int y3;
        int x4;
        int y4;

        if (x1 == x2) {
            int length = Math.abs(y1 - y2);

            x3 = x1 + length;
            y3 = y1;

            x4 = x2 + length;
            y4 = y2;
        } else if (y1 == y2) {
            int length = Math.abs(x1 - x2);

            x3 = x1;
            y3 = y1 + length;

            x4 = x2;
            y4 = y2 + length;
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            x3 = x1;
            y3 = y2;

            x4 = x2;
            y4 = y1;
        } else {
            System.out.println(-1);
            return;
        }

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
