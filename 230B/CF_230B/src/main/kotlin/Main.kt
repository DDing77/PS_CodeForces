import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb: StringBuilder = StringBuilder()
    var n: Int = readLine().toInt()
    var primes: BooleanArray = BooleanArray(1000001)

    primes[0] = true
    primes[1] = true

    for (i in 2..1000000) {
        if (!primes[i]) {
            for (j in i * 2..1000000 step (i)) {
                primes[j] = true
            }
        }
    }

    fun square(n: Long): Int {
        var sqrtN = Math.sqrt(n.toDouble())
        if (sqrtN == sqrtN.toInt().toDouble()) {
            return 1;
        } else {
            return 0;
        }
    }

    var st: StringTokenizer = StringTokenizer(readLine())
    while (st.hasMoreTokens()) {
        var cur: Long = st.nextToken().toLong();
        if (cur == 4L) {
            sb.append("YES")
        } else if (cur % 2 == 0L) {
            sb.append("NO")
        } else if (!primes[Math.sqrt(cur.toDouble())
                .toInt()] && square(cur) == 1
        ) {
            sb.append("YES")
        } else {
            sb.append("NO")
        }
        sb.append('\n')
    }
    println(sb)
}