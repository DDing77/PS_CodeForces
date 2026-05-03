package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private ArrayList<Integer> evenIdxList = new ArrayList<>();
    private ArrayList<Integer> oddIdxList = new ArrayList<>();

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if ((num & 1) == 1) {
                oddIdxList.add(i);
            } else {
                evenIdxList.add(i);
            }
        }

        if (oddIdxList.size() == 1) {
            System.out.println(oddIdxList.get(0) + 1);
        } else {
            System.out.println(evenIdxList.get(0) + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
