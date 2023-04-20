import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var n = readLine().toInt()
        var athletes = IntArray(n);

        var st = StringTokenizer(readLine())
        for (i in 0 until n) {
            athletes[i] = st.nextToken().toInt()
        }

        athletes.sort()

        var min = Integer.MAX_VALUE

        for (i in 1 until n) {
            min = min.coerceAtMost(athletes[i] - athletes[i - 1])
        }

        sb.append(min).append('\n')
    }
    print(sb)
}

fun main() {
    solution()
}
