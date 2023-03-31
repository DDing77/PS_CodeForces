import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var n = readLine().toInt()

    while (n-- > 0) {
        var input = readLine().uppercase(Locale.getDefault())

        if (input.equals("YES")) {
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