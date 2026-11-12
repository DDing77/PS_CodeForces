package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int t;
    private char[][] board;

    private void solution() throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            board = new char[10][10];

            for (int i = 0; i < board.length; i++) {
                board[i] = br.readLine().toCharArray();
            }

            int score = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'X') {
                        int top = i;
                        int bottom = 9 - i;
                        int left = j;
                        int right = 9 - j;

                        int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                        score += min + 1;
                    }
                }
            }
            sb.append(score).append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
