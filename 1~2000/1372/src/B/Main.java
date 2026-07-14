package B;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int smallestPrimeFactor = findSmallestPrimeFactor(n);

            int a = n / smallestPrimeFactor;
            int b = n - a;

            sb.append(a)
                    .append(' ')
                    .append(b)
                    .append('\n');
        }

        System.out.print(sb);
    }

    private static int findSmallestPrimeFactor(int n) {
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (n % divisor == 0) {
                return divisor;
            }
        }

        return n;
    }
}