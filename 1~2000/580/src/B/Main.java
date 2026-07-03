package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private long d;
    private Friend[] friends;
    private long res;

    private void solution() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        d = Long.parseLong(st.nextToken());

        friends = new Friend[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            friends[i] = new Friend(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
        }

        Arrays.sort(friends);

        int right = 0;
        long sum = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && friends[right].money - friends[left].money < d) {
                sum += friends[right].friendship;
                right++;
            }
            res = Math.max(res, sum);
            sum -= friends[left].friendship;
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    static class Friend implements Comparable<Friend> {
        long money;
        long friendship;

        public Friend(long money, long friendship) {
            this.money = money;
            this.friendship = friendship;
        }

        @Override
        public int compareTo(Friend o) {
            return Long.compare(this.money, o.money);
        }
    }
}
