import java.io.BufferedReader
import java.io.InputStreamReader

var str: String = ""
var t: Int = 0
var k: Int = 0
var input: String = ""

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()

    for (i in 1..2046) {
        if (i % 15 == 0) {
            str += "FB"
        } else if (i % 3 == 0) {
            str += "F"
        } else if (i % 5 == 0) {
            str += "B"
        }
    }

    t = readLine().toInt()
    while (t-- > 0) {
        k = readLine().toInt()
        input = readLine()

        if (!str.contains(input)) {
            sb.append("NO")
        } else {
            sb.append("YES")
        }
        sb.append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}