import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private int n, l;
    private int[] lanterns;
    private double res;

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        lanterns = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lanterns[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lanterns);

        res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, lanterns[i] - lanterns[i - 1]);
        }

        res /= 2.0;

        res = Math.max(res, lanterns[0]);
        res = Math.max(res, l - lanterns[n - 1]);

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
