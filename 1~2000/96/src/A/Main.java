package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private char[] str;

    private void solution() throws IOException {
        str = br.readLine().toCharArray();

        int zeroCnt = 0;
        int oneCnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '0') {
                zeroCnt++;
                oneCnt = 0;
            } else {
                zeroCnt = 0;
                oneCnt++;
            }

            if (zeroCnt == 7 || oneCnt == 7) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
