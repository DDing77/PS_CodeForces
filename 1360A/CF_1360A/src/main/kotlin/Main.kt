import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var st = StringTokenizer(readLine())
        var a = st.nextToken().toInt()
        var b = st.nextToken().toInt()

        if (b > a) {
            var temp = a;
            a = b;
            b = temp;
        }

        if (a > (b * 2)) {
            sb.append(a * a).append('\n')
        } else {
            sb.append((b * 2) * (b * 2)).append('\n')
        }
    }

    print(sb)
}

fun main() {
    solution()
}