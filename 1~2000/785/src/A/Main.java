package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private int n;
    private int answer;
    private String polyhedron;

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            polyhedron = br.readLine();

            switch (polyhedron) {
                case "Tetrahedron":
                    answer += 4;
                    break;
                case "Cube":
                    answer += 6;
                    break;
                case "Octahedron":
                    answer += 8;
                    break;
                case "Dodecahedron":
                    answer += 12;
                    break;
                case "Icosahedron":
                    answer += 20;
                    break;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}