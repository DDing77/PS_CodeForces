import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[] lucky = {4, 7, 47, 74, 447, 474, 477, 744, 747};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < lucky.length; i++) {
            if (n % lucky[i] == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
