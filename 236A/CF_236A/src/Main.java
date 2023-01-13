import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static String input;
    static Set<Character> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        set = new HashSet<>();

        input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            if (set.add(input.charAt(i))) ;
        }

        if (set.size() % 2 != 1) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
