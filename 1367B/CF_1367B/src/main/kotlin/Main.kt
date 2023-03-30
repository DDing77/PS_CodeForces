import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var st: StringTokenizer

    var t = readLine().toInt()
    while (t-- > 0) {
        var n = readLine().toInt()
        var odd = 0
        var even = 0

        st = StringTokenizer(readLine())
        for (i in 0 until n) {
            var cur = st.nextToken().toInt()
            if (i % 2 != cur % 2) {
                if (cur % 2 == 0) even++
                else {
                    odd++
                }
            }
        }

        if (even != odd) {
            sb.append(-1)
        } else {
            sb.append(even)
        }
        sb.append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}