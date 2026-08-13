package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int[] countArr = new int[26];

    private void solution() throws IOException {
        char[] inputA = br.readLine().toCharArray();
        char[] inputB = br.readLine().toCharArray();

        for (int i = 0; i < inputA.length; i++) {
            countArr[inputA[i] - 'A']++;
        }
        for (int i = 0; i < inputB.length; i++) {
            countArr[inputB[i] - 'A']++;
        }

        char[] inputC = br.readLine().toCharArray();
        for (int i = 0; i < inputC.length; i++) {
            countArr[inputC[i] - 'A']--;
        }

        for (int i : countArr) {
            if (i != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
