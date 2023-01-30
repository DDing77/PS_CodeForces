import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[] A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        A = br.readLine().toCharArray();
        B = br.readLine().toCharArray();


        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        System.out.println(sb);
    }
}
