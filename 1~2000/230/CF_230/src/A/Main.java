package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            dragons[i][0] = Integer.parseInt(st.nextToken());
            dragons[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dragons, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            int x = dragons[i][0];
            int y = dragons[i][1];

            if (s <= x) {
                System.out.println("NO");
                return;
            }

            s += y;
        }

        System.out.println("YES");
    }
}