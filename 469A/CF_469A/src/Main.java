import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int n, p;
    static boolean[] flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        flag = new boolean[n + 1];

        st = new StringTokenizer(br.readLine());
        p = Integer.parseInt(st.nextToken());
        for (int i = 0; i < p; i++) {
            flag[Integer.parseInt(st.nextToken())] = true;
        }

        st = new StringTokenizer(br.readLine());
        p = Integer.parseInt(st.nextToken());
        for (int i = 0; i < p; i++) {
            flag[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (flag[i] == true)
                continue;
            else {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }

}