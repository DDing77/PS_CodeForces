package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    private String s1;
    private String s2;

    private int getPosition(String commands) {
        int position = 0;

        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            if (command == '+') {
                position++;
            } else if (command == '-') {
                position--;
            }
        }

        return position;
    }

    private void solution() throws IOException {
        s1 = br.readLine();
        s2 = br.readLine();

        int targetPosition = getPosition(s1);
        int currentPosition = getPosition(s2);

        int questionCount = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '?') {
                questionCount++;
            }
        }

        int totalCases = 1 << questionCount;
        int successCases = 0;

        for (int mask = 0; mask < totalCases; mask++) {
            int position = currentPosition;

            for (int bit = 0; bit < questionCount; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    position++;
                } else {
                    position--;
                }
            }

            if (position == targetPosition) {
                successCases++;
            }
        }

        double probability = (double) successCases / totalCases;

        System.out.printf("%.12f%n", probability);
    }

    public static void main(String[] args) throws IOException {
        new Main().solution();
    }
}