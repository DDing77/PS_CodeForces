import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] shoes;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        shoes = new int[4];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            shoes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(shoes);

        res = 0;
        for (int i = 0; i < 3; i++) {
            if (shoes[i] == shoes[i + 1]) {
                res++;
            }
        }

        System.out.println(res);
    }
}
