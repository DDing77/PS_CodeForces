package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;
    private int n;
    private ArrayList<Integer> roundNumberList = new ArrayList<>();

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            roundNumberList.clear();

            int i = 1;
            while (n > 0) {
                int r = n % 10;
                if (r != 0) {
                    roundNumberList.add(r * i);
                }
                n /= 10;
                i *= 10;
            }

            sb.append(roundNumberList.size()).append("\n");
            for (Integer member : roundNumberList) {
                sb.append(member).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

