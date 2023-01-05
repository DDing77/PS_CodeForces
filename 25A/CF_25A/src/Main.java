import java.io.*;

public class Main {
    static int n;
    static int even;
    static int odd;
    static String num[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        num = br.readLine().split(" ");

        for (int i = 1; i <= n; i++) {
            if (Integer.parseInt(num[i - 1]) % 2 == 0) even += i;
            else odd += i;
        }

        System.out.println(Math.min(even, odd));
    }
}