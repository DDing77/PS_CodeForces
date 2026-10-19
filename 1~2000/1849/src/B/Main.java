package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;
    private int k;
    private PriorityQueue<Node> pq = new PriorityQueue<>();

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            pq.clear();

            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int health = Integer.parseInt(st.nextToken());
                health %= k;
                if (health == 0) {
                    health = k;
                }
                pq.add(new Node(i, health));
            }

            while (!pq.isEmpty()) {
                Node node = pq.poll();
                sb.append(node.idx).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    static class Node implements Comparable<Node> {
        int idx;
        int health;

        public Node(int idx, int health) {
            this.idx = idx;
            this.health = health;
        }

        @Override
        public int compareTo(Node o) {
            if (this.health == o.health) {
                return this.idx - o.idx;
            }
            return o.health - this.health;
        }
    }
}
