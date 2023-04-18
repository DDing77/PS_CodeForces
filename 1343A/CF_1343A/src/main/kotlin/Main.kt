import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var n = readLine().toInt()
        var first = 3;

        while (n % first != 0) {
            first = (first + 1) * 2 - 1
        }

        sb.append(n / first).append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}