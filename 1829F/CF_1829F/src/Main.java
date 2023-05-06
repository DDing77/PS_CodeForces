import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private int t;
    private int n;
    private int m;
    private int[] parents;
    private int[] degrees;


    public int find(int x) {
        if (parents[x] < 0) {
            return x;
        }
        return parents[x] = find(parents[x]);
    }

    public void union(int x, int y) {
        int a = find(x);
        int b = find(y);

        if (a == b) {
            return;
        }

        if (parents[a] <= parents[b]) {
            parents[a] += parents[b];
            parents[b] = a;
        } else {
            parents[b] += parents[a];
            parents[a] = b;
        }
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());


            degrees = new int[n + 1];
            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                degrees[from]++;
                degrees[to]++;
            }

            Arrays.sort(degrees);

            int leafCnt = 0;
            int childCnt = 0;
            int lastIdx = 0;
            for (int i = 1; i <= n; i++) {
                if (degrees[i] == 1) {
                    leafCnt++;
                } else if (degrees[i] != 1) {
                    lastIdx = i;
                    break;
                }
            }

            childCnt = n - lastIdx;

            sb.append(childCnt + " " + leafCnt / childCnt).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}