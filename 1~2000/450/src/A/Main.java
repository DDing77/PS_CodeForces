package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int m;
    private ArrayList<Children> childrens = new ArrayList<>();

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            childrens.add(new Children(i, (Integer.parseInt(st.nextToken()) + (m - 1)) / m));
        }

        Collections.sort(childrens);

        System.out.println(childrens.get(n - 1).idx + 1);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    static class Children implements Comparable<Children> {
        int idx;
        int cnt;

        public Children(int idx, int cnt) {
            this.idx = idx;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Children o) {
            if (this.cnt == o.cnt) {
                return this.idx - o.idx;
            }
            return this.cnt - o.cnt;
        }
    }
}
