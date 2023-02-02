import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static final String[] str = {
            "I",
            "hate",
            "love",
            "that",
            "it"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                sb.append(str[0] + " " + str[1] + " ");
            } else {
                sb.append(str[0] + " " + str[2] + " ");
            }
            if (i < N) sb.append(str[3] + " ");
        }

        sb.append(str[4]);
        System.out.println(sb);
    }
}
