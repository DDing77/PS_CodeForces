package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();

    private int n;
    private HashMap<String, Integer> scores = new HashMap<>();

    private void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String winnerTeamName = "";
        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            String teamName = br.readLine();
            int score = scores.merge(teamName, 1, Integer::sum);

            if (score > maxScore) {
                maxScore = score;
                winnerTeamName = teamName;
            }
        }

        System.out.println(winnerTeamName);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}

