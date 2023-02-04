import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int T;
    static double n;
    static long res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            n = Double.parseDouble(br.readLine());
            res = (long) Math.ceil((n / 2) - 1);
            sb.append(res).append('\n');
        }

        System.out.print(sb);
    }
}
