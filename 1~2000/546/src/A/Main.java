    package A;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {

        public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static final StringBuilder sb = new StringBuilder();
        public static StringTokenizer st;

        private int k;
        private long n;
        private int w;

        private void solution() throws IOException {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            n = Long.parseLong(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            long need = k * ((long) w * (w + 1)) / 2;

            if (n >= need) {
                System.out.println(0);
            } else {
                System.out.println(need - n);
            }
        }

        public static void main(String[] args) throws IOException {
            Main main = new Main();
            main.solution();
        }
    }
