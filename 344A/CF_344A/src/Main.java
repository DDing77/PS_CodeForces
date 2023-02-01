import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int res;
    static String[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
        }

        res = 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (!input[i].equals(input[i + 1]))
                res++;
        }

        System.out.println(res);
    }
}
