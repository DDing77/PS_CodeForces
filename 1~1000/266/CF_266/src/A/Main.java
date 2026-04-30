package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private char[] s;
    private int res;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        s = br.readLine().toCharArray();

        int cnt = 1;
        char pre = ' ';
        for (int i = 0; i < n; i++) {
            char cur = s[i];
            if (pre == cur) {
                cnt++;
            } else {
                res += cnt - 1;
                pre = cur;
                cnt = 1;
            }
        }
        res += cnt - 1;
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
