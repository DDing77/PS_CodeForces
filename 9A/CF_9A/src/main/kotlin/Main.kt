import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun getGCD(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    } else {
        return getGCD(b, a % b)
    }
}

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var st = StringTokenizer(readLine())
    var Y = st.nextToken().toInt()
    var W = st.nextToken().toInt()

    var remain = 6 - Y.coerceAtLeast(W) + 1

    if (remain == 0) {
        println("0/1")
    } else {
        var gcd = getGCD(6, remain)
        sb.append(remain / gcd).append("/").append(6 / gcd);
        println(sb)
    }
}

fun main() {
    solution()
}