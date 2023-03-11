import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var st: StringTokenizer
    var n: Int;
    var left: Int
    var right: Int

    n = readLine().toInt();
    while (n-- > 0) {
        st = StringTokenizer(readLine())
        left = st.nextToken().toInt()
        right = st.nextToken().toInt()

        var cnt = 0
        cnt += Math.abs(right - left) / 10
        if ((Math.abs(right - left) % 10) > 0) {
            cnt++
        }
        sb.append(cnt).append('\n')
    }

    print(sb)
}