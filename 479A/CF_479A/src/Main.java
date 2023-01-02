import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        int type1 = a * b * c;
        int type2 = a + b + c;
        int type3 = (a + b) * c;
        int type4 = a + (b * c);
        int type5 = (a * b) + c;
        int type6 = a * (b + c);

        System.out.println(Math.max(Math.max(Math.max(type1, type2), Math.max(type3, type4)), Math.max(type6, type5)));
    }
}
