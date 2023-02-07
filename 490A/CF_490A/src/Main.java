import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        Stack<Integer> prgIndecis = new Stack<Integer>();
        Stack<Integer> mathIndecis = new Stack<Integer>();
        Stack<Integer> peIndecis = new Stack<Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int teamMember = Integer.parseInt(st.nextToken());

            if (teamMember == 1)
                prgIndecis.push(i + 1);
            else if (teamMember == 2)
                mathIndecis.push(i + 1);
            else
                peIndecis.push(i + 1);
        }

        int numberOfTeam = Math.min(Math.min(prgIndecis.size(), mathIndecis.size()), peIndecis.size());
        sb.append(numberOfTeam).append("\n");

        for (int i = 0; i < numberOfTeam; i++)
            sb.append(String.format("%d %d %d\n", prgIndecis.pop(), mathIndecis.pop(), peIndecis.pop()));

        System.out.print(sb);
    }
}