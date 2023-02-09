import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, q, coin;
    static int[] drink;

    public static int lowerBound(int value) {
        int left = 0;
        int right = n;
        int mid;

        while (left < right) {
            mid = (left + right) >> 1;

            if (drink[mid] >= value) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static int upperBound(int value) {
        int left = 0;
        int right = n;
        int mid;

        while (left < right) {
            mid = (left + right) >> 1;

            if (drink[mid] <= value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        drink = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(drink);

        q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            coin = Integer.parseInt(br.readLine());
            sb.append(upperBound(coin)).append('\n');
        }

        System.out.print(sb);
    }
}
