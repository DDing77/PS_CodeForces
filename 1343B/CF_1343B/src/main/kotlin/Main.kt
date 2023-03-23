import java.io.BufferedReader
import java.io.InputStreamReader


fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()

    while (t-- > 0) {
        var n = readLine().toInt()

        if ((n / 2) % 2 == 1) {
            sb.append("NO").append('\n')
            continue
        }

        sb.append("YES").append('\n')

        var evenSum = 0
        for (i in 1..n / 2) {
            evenSum += i * 2
            sb.append(i * 2).append(" ")
        }

        for (i in 0 until n / 2 - 1) {
            evenSum -= (i * 2 + 1)
            sb.append(i * 2 + 1).append(" ")
        }
        sb.append(evenSum).append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}