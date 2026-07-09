package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;
    private int n;
    private HashMap<Integer, Long> map = new HashMap<>();

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            map.clear();
            map.put(0, 1L);

            int prefixSum = 0;
            long resCnt = 0;

            String input = br.readLine();
            for (int i = 1; i <= n; i++) {
                int number = input.charAt(i - 1) - '0';
                prefixSum += number;

                int key = prefixSum - i;

                long count = map.getOrDefault(key, 0L);
                resCnt += count;

                map.put(key, count + 1);
            }

            sb.append(resCnt).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
