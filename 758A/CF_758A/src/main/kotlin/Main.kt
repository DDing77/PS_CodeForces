import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    var citizens = IntArray(n)
    var st = StringTokenizer(readLine())

    for (i in 0 until n) {
        citizens[i] = st.nextToken().toInt()
    }

    Arrays.sort(citizens)

    var res = 0;
    for (i in 0 until n - 1) {
        res += citizens[n - 1] - citizens[i]
    }

    println(res)
}