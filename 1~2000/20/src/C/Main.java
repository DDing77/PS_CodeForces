package C;

import java.io.*;
import java.util.*;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n, m;
    private List<List<Node>> graph;
    private long[] dist;
    private int[] prev;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, w));
            graph.get(b).add(new Node(a, w));
        }

        dijkstra();

        if (dist[n] == Long.MAX_VALUE) {
            System.out.println(-1);
            return;
        }

        List<Integer> path = new ArrayList<>();
        int cur = n;

        while (cur != 0) {
            path.add(cur);
            cur = prev[cur];
        }

        Collections.reverse(path);

        for (int v : path) {
            sb.append(v).append(' ');
        }

        System.out.println(sb);
    }

    private void dijkstra() {
        dist = new long[n + 1];
        prev = new int[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> Long.compare(a.cost, b.cost));

        dist[1] = 0;
        pq.offer(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (dist[cur.to] < cur.cost) continue;

            for (Node next : graph.get(cur.to)) {
                long nextCost = cur.cost + next.cost;

                if (dist[next.to] > nextCost) {
                    dist[next.to] = nextCost;
                    prev[next.to] = cur.to;
                    pq.offer(new Node(next.to, nextCost));
                }
            }
        }
    }

    private static class Node {
        int to;
        long cost;

        Node(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}