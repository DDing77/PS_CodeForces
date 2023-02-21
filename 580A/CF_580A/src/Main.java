import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] moneys;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        moneys = new int[n];


        int res = 1;
        int cnt = 1;

        st = new StringTokenizer(br.readLine());
        moneys[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            moneys[i] = Integer.parseInt(st.nextToken());

            if (moneys[i - 1] <= moneys[i]) {
                cnt++;
                res = Math.max(res, cnt);
            } else {
                cnt = 1;
            }
        }

        System.out.println(res);
    }
}
