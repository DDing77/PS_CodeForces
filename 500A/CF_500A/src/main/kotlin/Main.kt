import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(kotlin.io.readLine())
    var n = st.nextToken().toInt()
    var t = st.nextToken().toInt()

    var portals = IntArray(n - 1)
    st = StringTokenizer(readLine())
    for (i in 0 until n - 1) {
        portals[i] = st.nextToken().toInt()
    }

    var cur = 1
    var idx = 0;
    while (cur < n) {
        cur += portals[idx]

        if (cur == t) {
            println("YES")
            return
        }

        idx = cur - 1;
    }

    println("NO")
}

fun main() {
    solution()
}