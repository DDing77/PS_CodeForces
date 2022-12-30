import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static long sumX, sumY, sumZ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        sumX = 0;
        sumY = 0;
        sumZ = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            sumX += Integer.parseInt(st.nextToken());
            sumY += Integer.parseInt(st.nextToken());
            sumZ += Integer.parseInt(st.nextToken());
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
