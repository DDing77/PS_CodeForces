import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            if (st.nextToken().equals("1")) {
                System.out.println("HARD");
                return;
            }
        }

        System.out.println("EASY");
    }
}
