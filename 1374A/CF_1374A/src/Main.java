import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int t;
    static int x, y, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            int remain = n % x;
            if (remain > y) {
                sb.append(n - remain + y);
            } else if (remain < y) {
                sb.append(n - remain - x + y);
            } else {
                sb.append(n);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
