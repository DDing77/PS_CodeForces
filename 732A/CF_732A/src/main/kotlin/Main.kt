import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

var K: Int = 0
var r: Int = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    K = st.nextToken().toInt()
    r = st.nextToken().toInt()

    var cnt = 1
    while (true) {
        if (K * cnt % 10 == 0 || ((K * cnt) % 10) == r) {
            break
        }
        cnt++
    }

    println(cnt)
}