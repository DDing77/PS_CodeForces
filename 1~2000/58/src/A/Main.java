package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private String str;
    private Queue<Character> que = new LinkedList<>();

    private void solution() throws IOException {
        que.add('h');
        que.add('e');
        que.add('l');
        que.add('l');
        que.add('o');

        str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!que.isEmpty() && que.peek() == c) {
                que.poll();
            }
        }

        if (que.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
