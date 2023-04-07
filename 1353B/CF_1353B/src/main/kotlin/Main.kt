import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()

    var t = readLine().toInt()
    while (t-- > 0) {
        var st = StringTokenizer(readLine())
        var n = st.nextToken().toInt()
        var k = st.nextToken().toInt()

        var a = IntArray(n)
        st = StringTokenizer(readLine())
        for (i in 0 until n) {
            a[i] = st.nextToken().toInt()
        }

        var b = IntArray(n)
        st = StringTokenizer(readLine())
        for (i in 0 until n) {
            b[i] = st.nextToken().toInt()
        }

        a.sort()
        b.sortDescending();

        var sum = 0
        var bIdx = 0
        for (i in 0 until n) {
            if (a[i] < b[bIdx] && k > 0) {
                sum += b[bIdx++]
                k--
                continue
            }
            sum += a[i]
        }
        sb.append(sum).append('\n')
    }
    print(sb)
}

fun main() {
    solution()
}