import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var input = readLine().toInt()
        var res = (input % 10 - 1) * 10

        for (i in 1..input.toString().length) {
            res += i
        }
        sb.append(res).append('\n')
    }
    print(sb)
}

fun main() {
    solution()
}