import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static double res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        res = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            res += Double.parseDouble(st.nextToken());
        }

        System.out.println(res / n);
    }
}

