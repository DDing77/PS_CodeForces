import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private int n;
    private int[] scores;
    private int max, min;
    private int res;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        scores = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        max = scores[0];
        min = scores[0];

        res = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > max) {
                max = scores[i];
                res++;
            }
            if (scores[i] < min) {
                min = scores[i];
                res++;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
