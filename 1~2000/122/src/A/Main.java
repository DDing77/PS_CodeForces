package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private ArrayList<Integer> list = new ArrayList<>();

    private void init() {
        list.add(4);
        list.add(7);
        list.add(44);
        list.add(47);
        list.add(74);
        list.add(77);
        list.add(444);
        list.add(447);
        list.add(474);
        list.add(477);
        list.add(744);
        list.add(747);
        list.add(774);
        list.add(777);
    }

    private void solution() throws IOException {
        init();

        int num = Integer.parseInt(br.readLine());

        for (Integer q : list) {
            if (num % q == 0) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
