package A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());

        int[] heights = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }

        }
        int answer = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex) {
            answer--;
        }
        System.out.println(answer);

    }
}
