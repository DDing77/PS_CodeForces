package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String strA;
    private String strB;

    private void solution() throws IOException {
        strA = br.readLine().toLowerCase();
        strB = br.readLine().toLowerCase();

        int res = strA.compareTo(strB);
        if (res == 0) {
            System.out.println(0);
        } else if (res < 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
