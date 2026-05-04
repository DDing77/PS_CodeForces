package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int[] cntArr;
    private int res;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());

        cntArr = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cntArr[Integer.parseInt(st.nextToken())]++;
        }

        // 4
        res += cntArr[4];

        // 1 + 3
        int min13 = Math.min(cntArr[1], cntArr[3]);
        res += min13;
        cntArr[1] -= min13;
        cntArr[3] -= min13;

        // 3
        res += cntArr[3];

        // 2 + 2
        int min22 = cntArr[2] / 2;
        res += min22;
        cntArr[2] %= 2;

        // 2 + 1
        if (cntArr[2] > 0) {
            res++;
            cntArr[1] -= Math.min(cntArr[1], 2);
        }

        res += (cntArr[1] + 3) / 4;

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}