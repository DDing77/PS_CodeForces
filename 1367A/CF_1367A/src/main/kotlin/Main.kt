import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var n = readLine().toInt()
    var input: String

    while (n-- > 0) {
        input = readLine()
        if (input.length < 4) {
            sb.append(input).append('\n')
            continue
        }

        for (i in input.indices step (2)) {
            sb.append(input[i])
        }
        sb.append(input[input.length - 1])
        sb.append('\n')
    }

    print(sb)
}