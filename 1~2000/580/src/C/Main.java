package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int m;
    private int[] isCat;
    private ArrayList<Integer>[] edges;
    private int res;

    private void execBFS() {
        boolean[] isVisited = new boolean[n + 1];
        Queue<int[]> que = new ArrayDeque<>();

        que.add(new int[]{1, isCat[1]});
        isVisited[1] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int node = cur[0];
            int catCount = cur[1];

            if (catCount > m) {
                continue;
            }

            if (edges[cur[0]].size() == 1 && node != 1) {
                res++;
                continue;
            }

            for (int next : edges[cur[0]]) {
                if (!isVisited[next]) {
                    isVisited[next] = true;

                    int nextCnt;
                    if (isCat[next] == 1) {
                        nextCnt = catCount + 1;
                    } else {
                        nextCnt = 0;
                    }
                    que.add(new int[]{next, nextCnt});
                }
            }
        }
    }

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        isCat = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a == 1) {
                isCat[i]++;
            }
        }

        edges = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            edges[x].add(y);
            edges[y].add(x);
        }

        execBFS();

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

