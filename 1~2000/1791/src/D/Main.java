package D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;
    private int n;
    private String s;
    private int resMax;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            s = br.readLine();
            resMax = 0;

            int leftCnt = 0;
            int rightCnt = 0;

            int[] leftCntArr = new int[26];
            int[] rightCntArr = new int[26];

            for (char c : s.toCharArray()) {
                if (rightCntArr[c - 'a'] == 0) {
                    rightCnt++;
                }
                rightCntArr[c - 'a']++;
            }

            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                rightCntArr[idx]--;

                if (rightCntArr[idx] == 0) {
                    rightCnt--;
                }

                if (leftCntArr[idx] == 0) {
                    leftCnt++;
                }
                leftCntArr[idx]++;

                resMax = Math.max(resMax, leftCnt + rightCnt);
            }
            sb.append(resMax).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
