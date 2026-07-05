package D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int t;
    private int n;

    private Node[] a;
    private Node[] b;
    private Node[] c;

    static class Node implements Comparable<Node> {
        int day;
        int value;

        Node(int day, int value) {
            this.day = day;
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            return o.value - this.value;
        }
    }

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());

            a = new Node[n];
            b = new Node[n];
            c = new Node[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = new Node(i, Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = new Node(i, Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                c[i] = new Node(i, Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);

            long answer = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (a[i].day == b[j].day) {
                            continue;
                        }

                        if (a[i].day == c[k].day) {
                            continue;
                        }

                        if (b[j].day == c[k].day) {
                            continue;
                        }

                        answer = Math.max(answer,
                                (long) a[i].value + b[j].value + c[k].value);
                    }
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}