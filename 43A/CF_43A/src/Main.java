import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static int N;
    static HashMap<String, Integer> teams;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        teams = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String team = br.readLine();

            if (!teams.containsKey(team)) teams.put(team, 1);
            else {
                teams.put(team, teams.get(team) + 1);
            }
        }

        int max = 0;

        for (String key : teams.keySet()) {
            max = Math.max(max, teams.get(key));
        }

        for (String key : teams.keySet()) {
            if (teams.get(key) == max) {
                System.out.println(key);
                return;
            }
        }
    }
}
