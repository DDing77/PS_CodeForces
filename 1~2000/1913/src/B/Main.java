package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();

            int zeroCnt = 0;
            int oneCnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }

            int goodLength = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (oneCnt == 0) {
                        break;
                    }

                    oneCnt--;
                } else {
                    if (zeroCnt == 0) {
                        break;
                    }

                    zeroCnt--;
                }

                goodLength++;
            }

            sb.append(s.length() - goodLength).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
