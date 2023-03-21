import java.io.BufferedReader
import java.io.InputStreamReader

var input: String = ""
var res: String = ""

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()

    input = readLine()
    var idx = 0
    while (idx < input.length) {
        if (input[idx] == '.') {
            sb.append(0)
            idx++
        } else if (idx + 1 < input.length && input[idx + 1] == '.') {
            sb.append(1)
            idx += 2
        } else if (idx + 1 < input.length && input[idx + 1] == '-') {
            sb.append(2)
            idx.plus(1)
            idx += 2
        }
    }

    println(sb)
}

fun main() {
    solution()
}