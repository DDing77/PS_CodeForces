import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int zeroCnt = 0;
        int oneCnt = 0;

        String input = br.readLine();

        for (char ch : input.toCharArray()) {
            if (ch == '0') {
                zeroCnt++;
                oneCnt = 0;
            }
            if (ch == '1') {
                oneCnt++;
                zeroCnt = 0;
            }
            if (zeroCnt == 7 || oneCnt == 7) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
