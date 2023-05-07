import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int t;
    private int n;
    private int m;
    private int[][] map;
    private boolean[][] isVisited;
    private int res;

    public int execBFS(int x, int y) {
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        que.add(y);
        isVisited[x][y] = true;

        int sum = 0;
        while (!que.isEmpty()) {
            int curX = que.poll();
            int curY = que.poll();

            sum += map[curX][curY];

            for (int k = 0; k < 4; k++) {
                int nX = curX + dir[k][0];
                int nY = curY + dir[k][1];

                if (nX < 0 || nX >= n || nY < 0 || nY >= m) {
                    continue;
                }

                if (isVisited[nX][nY]) {
                    continue;
                }

                if (map[nX][nY] == 0) {
                    continue;
                }

                que.add(nX);
                que.add(nY);
                isVisited[nX][nY] = true;
            }
        }
        return sum;
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

            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            isVisited = new boolean[n][m];

            res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!isVisited[i][j] && map[i][j] != 0) {
                        res = Math.max(res, execBFS(i, j));
                    }
                }
            }

            sb.append(res).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}
