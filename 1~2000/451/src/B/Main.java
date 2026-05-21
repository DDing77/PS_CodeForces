package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    private int n;
    private long[] a;

    private boolean isSorted() {
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void reverse(int left, int right) {
        while (left < right) {
            long temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    private void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        a = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        int left = 1;
        while (left < n && a[left] < a[left + 1]) {
            left++;
        }

        if (left == n) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        int right = left;

        while (right < n && a[right] > a[right + 1]) {
            right++;
        }

        reverse(left, right);

        if (isSorted()) {
            System.out.println("yes");
            System.out.println(left + " " + right);
        } else {
            System.out.println("no");package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

            public class Main {

                public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                public static final StringBuilder sb = new StringBuilder();
                public static StringTokenizer st;

                private int n;
                private long[] a;

                private boolean isSorted() {
                    for (int i = 1; i < n; i++) {
                        if (a[i] > a[i + 1]) {
                            return false;
                        }
                    }
                    return true;
                }

                private void reverse(int left, int right) {
                    while (left < right) {
                        long temp = a[left];
                        a[left] = a[right];
                        a[right] = temp;
                        left++;
                        right--;
                    }
                }

                private void solution() throws IOException {
                    n = Integer.parseInt(br.readLine());
                    a = new long[n + 1];
                    st = new StringTokenizer(br.readLine());
                    for (int i = 1; i <= n; i++) {
                        a[i] = Long.parseLong(st.nextToken());
                    }

                    int left = 1;
                    while (left < n && a[left] < a[left + 1]) {
                        left++;
                    }

                    if (left == n) {
                        System.out.println("yes");
                        System.out.println("1 1");
                        return;
                    }

                    int right = left;

                    while (right < n && a[right] > a[right + 1]) {
                        right++;
                    }

                    reverse(left, right);

                    if (isSorted()) {
                        System.out.println("yes");
                        System.out.println(left + " " + right);
                    } else {
                        System.out.println("no");
                    }
                }

                public static void main(String[] args) throws IOException {
                    B.Main main = new B.Main();
                    main.solution();
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
