import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static HashMap<String, Integer> polyhedrons;
    static int n;
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        polyhedrons = new HashMap<>();
        polyhedrons.put("Tetrahedron", 4);
        polyhedrons.put("Cube", 6);
        polyhedrons.put("Octahedron", 8);
        polyhedrons.put("Dodecahedron", 12);
        polyhedrons.put("Icosahedron", 20);

        n = Integer.parseInt(br.readLine());
        res = 0;
        for (int i = 0; i < n; i++) {
            res += polyhedrons.get(br.readLine());
        }

        System.out.println(res);
    }
}
