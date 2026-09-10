package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int[] distance;
    private int resCnt;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            distance = new int[4];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < distance.length; i++) {
                distance[i] = Integer.parseInt(st.nextToken());
            }

            resCnt = 0;
            for (int i = 1; i < distance.length; i++) {
                if (distance[i] > distance[0]) {
                    resCnt++;
                }
            }

            sb.append(resCnt).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

