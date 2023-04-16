import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()

    while (t-- > 0) {
        sb.append(readLine().toInt() / 2).append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}