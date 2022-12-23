import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int cnt = 0;
            for (int i = 0; i < 3; i++) {
                if (Integer.parseInt(st.nextToken()) == 1) cnt++;
            }

            if (cnt >= 2) res++;
        }

        System.out.println(res);
    }
}
