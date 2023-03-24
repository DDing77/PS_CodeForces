import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    var n = st.nextToken().toInt()
    var lengths = IntArray(3)

    for (i in 0..2) {
        lengths[i] = st.nextToken().toInt()
    }

    Arrays.sort(lengths)

    var dp = IntArray(n + 1)

    for (length in 0..n) {
        for (i in lengths.indices) {
            if (length % lengths[i] == 0) {
                dp[length] = Math.max(dp[length], length / lengths[i])
            } else {
                if (dp[length] > 0) {
                    if (length + lengths[i] <= n) {
                        dp[length + lengths[i]] = Math.max(dp[length + lengths[i]], dp[length] + 1)
                    }
                }
            }
        }
    }

    println(dp[n])
}

fun main() {
    solution()
}