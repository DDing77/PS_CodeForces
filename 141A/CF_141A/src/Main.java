import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private String inputA, inputB, inputC;
    private int[] cntA, cntB, cntC;

    public void getCnt(String input, int[] arr) {
        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'A']++;
        }
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputA = br.readLine();
        inputB = br.readLine();
        inputC = br.readLine();

        cntA = new int[26];
        cntB = new int[26];
        cntC = new int[26];

        getCnt(inputA, cntA);
        getCnt(inputB, cntB);
        getCnt(inputC, cntC);

        for (int i = 0; i < 26; i++) {
            if (cntC[i] != cntA[i] + cntB[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
