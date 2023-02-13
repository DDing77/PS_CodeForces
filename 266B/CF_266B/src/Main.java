import java.io.*;
import java.util.*;

public class Main {

    static int n, t;
    static String input;

    public static void main(String ae[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        input = br.readLine();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < (input.length() - 1); j++) {
                if ((input.charAt(j) == 'B') && (input.charAt(j + 1) == 'G')) {
                    char[] myNameChars = input.toCharArray();
                    myNameChars[j] = 'G';
                    myNameChars[j + 1] = 'B';
                    input = String.valueOf(myNameChars);
                    j++;
                }
            }
        }
        System.out.println(input);
    }
}