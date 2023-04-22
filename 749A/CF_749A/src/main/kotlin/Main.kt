import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var n = readLine().toInt()

    if (n % 2 == 0) {
        sb.append(n / 2).append('\n')

        for (i in n downTo 1 step 2) {
            sb.append("2 ")
        }
    } else {
        sb.append(n / 2).append('\n')

        for (i in n downTo 4 step 2) {
            sb.append("2 ")
        }
        sb.append("3")
    }

    print(sb)
}

fun main() {
    solution()
}