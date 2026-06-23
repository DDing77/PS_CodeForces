package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int[] answer;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());

        answer = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int giver = 1; giver <= n; giver++) {
            int receiver = Integer.parseInt(st.nextToken());
            answer[receiver] = giver;
        }

        for (int i = 1; i <= n; i++) {
            sb.append(answer[i]).append(' ');
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
