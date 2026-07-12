package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private HashSet<Character> set = new HashSet<>();

    private void solution() throws IOException {
         n = Integer.parseInt(br.readLine());
         String input = br.readLine().toLowerCase();
        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            set.add(c);
        }

        if (set.size() == 26) {
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
