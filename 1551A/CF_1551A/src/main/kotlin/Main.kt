import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var n = readLine().toInt()
        if (n % 3 == 1) {
            sb.append(n / 3 + 1).append(" ").append(n / 3)
        } else if (n % 3 == 0) {
            sb.append(n / 3).append(" ").append(n / 3)
        } else {
            sb.append(n / 3).append(" ").append(n / 3 + 1)
        }
        sb.append('\n');
    }

    print(sb)
}

fun main() {
    solution()
}