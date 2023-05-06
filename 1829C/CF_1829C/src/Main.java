import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    private int t;
    private int n;
    private PriorityQueue<Integer> type10;
    private PriorityQueue<Integer> type01;
    private PriorityQueue<Integer> type11;
    private int res;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            type10 = new PriorityQueue<>();
            type01 = new PriorityQueue<>();
            type11 = new PriorityQueue<>();
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                int val = Integer.parseInt(st.nextToken());
                String type = st.nextToken();

                if (type.equals("11")) {
                    type11.add(val);
                } else if (type.equals("10")) {
                    type10.add(val);
                } else if (type.equals("01")) {
                    type01.add(val);
                }
            }

            res = 0;
            int min = Integer.MAX_VALUE;
            if (!type11.isEmpty()) {
                min = Math.min(min, type11.poll());
            }
            if (type10.size() > 0 && type01.size() > 0) {
                res += type10.poll();
                res += type01.poll();
                min = Math.min(min, res);
            }

            if (min == Integer.MAX_VALUE) {
                sb.append("-1");
            } else {
                sb.append(min);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
