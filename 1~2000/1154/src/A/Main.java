package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int[] xArr = new int[4];

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < xArr.length; i++) {
            xArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xArr);

        for (int i = 0; i < xArr.length - 1; i++) {
            sb.append(xArr[xArr.length - 1] - xArr[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
