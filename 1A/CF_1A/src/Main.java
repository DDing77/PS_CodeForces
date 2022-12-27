import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long n, m, a;
    static long res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Long.parseLong(st.nextToken());
        m = Long.parseLong(st.nextToken());
        a = Long.parseLong(st.nextToken());

        long row = n / a;
        row += n % a > 0 ? 1 : 0;
        long col = m / a;
        col += m % a > 0 ? 1 : 0;

        res = row * col;
        System.out.println(res);
    }
}
