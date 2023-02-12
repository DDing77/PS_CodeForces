import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int r, c;
    static String row, left, right;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        row = "";
        left = "";
        right = "";

        for (int i = 0; i < c; i++) {
            row += "#";

            if (i == 0) {
                left += "#";
                right += ".";
                continue;
            }

            if (i == c - 1) {
                left += ".";
                right += "#";
                continue;
            }
            left += ".";
            right += ".";
        }

        int cnt = 0;
        while (r > 0) {
            if (r % 2 == 1) {
                sb.append(row);
            } else {
                if (cnt % 2 == 0) {
                    sb.append(right);
                } else {
                    sb.append(left);
                }
                cnt++;
            }
            sb.append('\n');
            r--;
        }

        System.out.print(sb);
    }
}
