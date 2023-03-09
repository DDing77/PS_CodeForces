import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var m: Int
    var n: Int
    var a: Int
    var b: Int

    var st = StringTokenizer(readLine())
    m = st.nextToken().toInt()
    n = st.nextToken().toInt()
    a = m * n
    if (m > n) b = a / m
    else b = a / n

    if (b % 2 == 0) {
        println("Malvika")
    } else {
        println("Akshat")
    }
}