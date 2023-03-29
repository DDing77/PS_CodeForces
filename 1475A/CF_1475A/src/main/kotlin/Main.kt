import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var input = readLine().toLong()
        while (input % 2 != 1L) {
            input /= 2
        }

        if (input >= 3) {
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