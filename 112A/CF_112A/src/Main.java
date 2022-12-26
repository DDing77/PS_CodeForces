import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String A;
    static String B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = br.readLine().toUpperCase();
        B = br.readLine().toUpperCase();

        if (A.equals(B)) {
            System.out.println(0);
        } else if (A.compareTo(B) <= 0) {
            System.out.println(-1);
        } else System.out.println(1);
    }
}
