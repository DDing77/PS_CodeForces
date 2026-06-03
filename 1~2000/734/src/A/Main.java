package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private char[] s;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        s = br.readLine().toCharArray();

        int aCnt = 0;
        int dCnt = 0;

        for (char c : s) {
            if (c == 'A') {
                aCnt++;
            } else {
                dCnt++;
            }
        }

        if (aCnt > dCnt) {
            System.out.println("Anton");
        } else if (dCnt > aCnt) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
