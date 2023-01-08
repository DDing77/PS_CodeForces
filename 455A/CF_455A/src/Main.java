import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static long[] a, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        a=new long[100001];
        dp=new long[100001];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            a[Integer.parseInt(st.nextToken())]++;
        }

        dp[0]=0;
        dp[1]=a[1];

        for(int i=2;i<=100000;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+a[i]*(long)i);
        }

        System.out.println(dp[100000]);
    }

}