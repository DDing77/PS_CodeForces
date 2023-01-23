import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String s, t;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        s = br.readLine();
        t = br.readLine();

        if (sb.append(t).reverse().toString().equals(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
