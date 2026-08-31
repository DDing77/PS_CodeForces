package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private int[] card;
    private int sumA;
    private int sumB;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = n - 1;
        int turn = 1;
        while (left <= right) {
            if (card[left] > card[right]) {
                if ((turn & 1) > 0) {
                    sumA += card[left++];
                } else {
                    sumB += card[left++];
                }
            } else {
                if ((turn & 1) > 0) {
                    sumA += card[right--];
                } else {
                    sumB += card[right--];
                }
            }
            turn++;
        }
        System.out.println(sumA + " " + sumB);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

