import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        res = 0;

        res += n / 100;
        n %= 100;
        res += n / 20;
        n %= 20;
        res += n / 10;
        n %= 10;
        res += n / 5;
        n %= 5;
        res += n / 1;

        System.out.println(res);
    }
}
