import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    var fences = IntArray(n + 1)
    st = StringTokenizer(readLine())
    for (i in 1..n) {
        fences[i] = st.nextToken().toInt() + fences[i - 1]
    }

    var res = 0
    var sum = Integer.MAX_VALUE
    for (i in k..n) {
        if (sum > fences[i] - fences[i - k]) {
            res = i - k + 1
            sum = fences[i] - fences[i - k]
        }
    }

    println(res)
}

fun main() {
    solution()
}