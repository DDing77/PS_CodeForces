import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());

        if (k <= (n + 1) / 2) {
            System.out.println(k * 2 - 1);
        } else {
            System.out.println((k - (n + 1) / 2) * 2);
        }
    }
}
