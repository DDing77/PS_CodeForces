import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int aCnt, dCnt;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        input = br.readLine();

        aCnt = 0;
        dCnt = 0;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            if (ch == 'A') aCnt++;
            else dCnt++;
        }

        if (aCnt == dCnt) {
            System.out.println("Friendship");
        } else if (aCnt > dCnt) {
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }
}
