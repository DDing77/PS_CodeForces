import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long n;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Long.parseLong(br.readLine());

        while (n > 0) {
            if (n % 10 == 4 || n % 10 == 7) {
                res++;
            }
            n /= 10;
        }

        if (res == 4 || res == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
