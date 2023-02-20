import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int k, l, m, n, d;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());
        l = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());

        res = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                res++;
            }
        }

        System.out.println(res);
    }
}
