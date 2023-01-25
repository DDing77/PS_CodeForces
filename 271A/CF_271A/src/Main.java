import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int y;
    static int[] digit;

    public static void getDigit() {
        int temp = y;
        int idx = 0;
        while (temp > 0) {
            digit[idx] = temp % 10;
            temp /= 10;
            idx++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        y = Integer.parseInt(br.readLine()) + 1;
        digit = new int[4];

        getDigit();

        while (true) {
            getDigit();
            if (digit[0] != digit[1]
                    && digit[0] != digit[2]
                    && digit[0] != digit[3]
                    && digit[1] != digit[2]
                    && digit[1] != digit[3]
                    && digit[2] != digit[3]) {
                break;
            } else {
                y++;
            }
        }

        System.out.println(y);
    }
}
