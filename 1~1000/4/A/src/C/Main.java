package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private HashMap<String, Integer> db = new HashMap<>();

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (db.containsKey(name)) {
                String newName = name + db.get(name);
                db.put(name, db.get(name) + 1);
                db.put(newName, 1);
                sb.append(newName).append("\n");
            } else {
                db.put(name, 1);
                sb.append("OK").append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
