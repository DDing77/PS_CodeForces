import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()

    var t = readLine().toInt()
    while (t-- > 0) {
        var rating = readLine().toInt()
        if (rating >= 1900) {
            sb.append("Division 1")
        } else if (rating >= 1600) {
            sb.append("Division 2")
        } else if (rating >= 1400) {
            sb.append("Division 3")
        } else {
            sb.append("Division 4")
        }
        sb.append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}