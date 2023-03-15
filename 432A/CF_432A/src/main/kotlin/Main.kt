import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    var n = st.nextToken().toInt()
    var k = st.nextToken().toInt()

    var res = 0;
    st = StringTokenizer(readLine())
    for (i in 1..n) {
        var cur = st.nextToken().toInt()

        if (cur + k <= 5) {
            res++
        }
    }

    println(res / 3)
}