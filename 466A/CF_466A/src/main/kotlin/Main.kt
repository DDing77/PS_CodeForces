import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    var n = st.nextToken().toInt()
    var m = st.nextToken().toInt()
    var a = st.nextToken().toDouble()
    var b = st.nextToken().toDouble()
    var res: Double = 0.0

    if (a > b / m) {
        res += n / m * b
        n %= m
        if (n > 0) {
            if (a * n < b) {
                res += a * n
            } else {
                res += b
            }
        }
    } else {
        res = n * a
    }

    println(res.toInt())
}

fun main() {
    solution()
}