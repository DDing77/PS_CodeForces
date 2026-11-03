package B;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int count2 = 0;
            int count3 = 0;

            while (n % 2 == 0) {
                n /= 2;
                count2++;
            }

            while (n % 3 == 0) {
                n /= 3;
                count3++;
            }

            if (n != 1 || count2 > count3) {
                sb.append(-1);
            } else {
                sb.append(2 * count3 - count2);
            }

            sb.append('\n');
        }

        System.out.print(sb);
    }
}
