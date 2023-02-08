import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long input;
    static long res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = Long.parseLong(br.readLine());

        res = 0;
        if (input % 2 == 0) {
            res = input / 2;
        } else {
            res = (-1) * (input / 2 + 1);
        }

        System.out.println(res);
    }
}
