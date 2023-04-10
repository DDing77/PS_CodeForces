import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var leftSum = 0
        var rightSum = 0
        var input = readLine()

        for (i in 0 until input.length / 2) {
            leftSum += input[i] - '0'
        }

        for (i in input.length / 2 until input.length) {
            rightSum += input[i] - '0'
        }

        if (leftSum == rightSum) {
            sb.append("YES")
        } else {
            sb.append("NO")
        }
        sb.append('\n')
    }
    print(sb)
}

fun main() {
    solution()
}