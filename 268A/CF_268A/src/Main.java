import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] h, a;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        h = new int[n];
        a = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            h[i] = Integer.parseInt(st.nextToken());
            a[i] = Integer.parseInt(st.nextToken());
        }

        res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (h[i] == a[j]) {
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
