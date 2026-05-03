package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int l;
    private int[] lanterns;
    private double resMax;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        lanterns = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lanterns[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(lanterns);

        resMax = Math.max(lanterns[0], l - lanterns[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            resMax = Math.max(resMax, (double) (lanterns[i + 1] - lanterns[i]) / 2);
        }
        System.out.println(resMax);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
