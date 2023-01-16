import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int k, n, w;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        int sum = 0;
        int cnt = 1;

        while (w-- > 0) {
            sum += k * cnt++;
        }

        if (sum > n) System.out.println(sum - n);
        else System.out.println(0);
    }
}
