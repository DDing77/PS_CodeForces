import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int x, y;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean flag = true;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                if (st.nextToken().equals("1")) {
                    x = i;
                    y = j;
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }

        res = Math.abs(2 - x) + Math.abs(2 - y);
        System.out.println(res);
    }
}
