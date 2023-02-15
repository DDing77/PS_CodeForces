import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    static int n;
    static int[] coin;
    static int total, res;

    public static void main(String[ ] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        coin = new int[n];
        total = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(st.nextToken());
            total += coin[i];
        }

        Arrays.sort(coin);

        res = 0;
        int temp = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (total >= temp) {
                temp += coin[i];
                res++;
                total -= coin[i];
            } else break;
        }

        System.out.println(res);
    }
}