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

    private int[] coordinate = new int[3];

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        coordinate[0] = Integer.parseInt(st.nextToken());
        coordinate[1] = Integer.parseInt(st.nextToken());
        coordinate[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(coordinate);
        System.out.println(coordinate[2] - coordinate[0]);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
