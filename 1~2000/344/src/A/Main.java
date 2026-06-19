package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private int res;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());

        String pre = "";
        for (int i = 0; i < n; i++) {
            String magnet = br.readLine();
            if (!magnet.equals(pre)) {
                res++;
                pre = magnet;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
