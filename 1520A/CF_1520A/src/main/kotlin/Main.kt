import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()

    while (t-- > 0) {
        var alpha = BooleanArray(26)
        var n = readLine().toInt()
        var input = readLine()

        var idx = 0
        var flag = true
        while (idx < n) {
            var cur = input[idx]

            if (alpha[cur - 'A']) {
                flag = false
                break;
            }

            alpha[cur - 'A'] = true

            while (idx + 1 < n && cur == input[idx + 1]) {
                idx++;
            }
            idx++
        }

        if (!flag) {
            sb.append("NO").append('\n')
        } else {
            sb.append("YES").append('\n')
        }
    }

    print(sb)
}

fun main() {
    solution()
}