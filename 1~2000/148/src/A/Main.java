package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int k;
    private int l;
    private int m;
    private int n;
    private int d;
    private boolean[] isChecked;

    private void solution() throws IOException {
        k = Integer.parseInt(br.readLine());
        l = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());

        isChecked = new boolean[d + 1];
        for (int i = 1; i <= d; i++) {
            if (i % k == 0) {
                isChecked[i] = true;
            } else if (i % l == 0) {
                isChecked[i] = true;
            } else if (i % m == 0) {
                isChecked[i] = true;
            } else if (i % n == 0) {
                isChecked[i] = true;
            }
        }

        int res = 0;
        for (int i = 1; i <= d; i++) {
            if (isChecked[i]) {
                res++;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
