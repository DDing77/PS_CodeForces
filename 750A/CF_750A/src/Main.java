import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int limit = 240 - k;

        int left = 1;
        int right = n;
        int mid;

        while (left <= right) {
            mid = (left + right) >> 1;
            int time = 0;
            for (int i = 1; i <= mid; i++) {
                time += 5 * i;
            }

            if (time <= limit) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}
