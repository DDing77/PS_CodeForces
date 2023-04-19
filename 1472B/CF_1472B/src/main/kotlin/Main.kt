import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var n = readLine().toInt()
        var candy = IntArray(2)

        var st = StringTokenizer(readLine())
        while (n-- > 0) {
            if (st.nextToken().toInt() == 1) {
                candy[0]++
            } else {
                candy[1]++
            }
        }

        if (candy[0] % 2 == 1) {
            sb.append("NO")
        } else if (candy[1] % 2 == 0 || (candy[0] >= 2 && candy[1] % 2 == 1)) {
            sb.append("YES")
        } else {
            sb.append("NO")
        }
        sb.append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}