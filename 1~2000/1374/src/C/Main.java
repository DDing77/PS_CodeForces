package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;
    private int n;
    private char[] input;
    private int res;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            input = br.readLine().toCharArray();

            res = 0;
            int openCnt = 0;

            for (char c : input) {
                if (c == '(') {
                    openCnt++;
                } else {
                    openCnt--;

                    if (openCnt < 0) {
                        openCnt = 0;
                        res++;
                    }
                }
            }
            sb.append(res).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
