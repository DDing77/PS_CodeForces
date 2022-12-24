import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int[] scores;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        scores = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) scores[i] = Integer.parseInt(st.nextToken());

        res = 0;
        int target = scores[k - 1];
        for(int i=0; i<n; i++) {
            if(scores[i] >= target && scores[i] > 0) res++;
        }

        System.out.println(res);

    }
}
