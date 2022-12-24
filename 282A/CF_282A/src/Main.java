import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static String op;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        res = 0;
        while (n-- > 0) {
            op = br.readLine();
            if (op.equals("++X") || op.equals("X++")) res++;
            else res--;
        }

        System.out.println(res);
    }
}
