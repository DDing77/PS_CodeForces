import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var st: StringTokenizer
    var arr: IntArray

    var T = readLine().toInt()
    while (T-- > 0) {
        var n = readLine().toInt()
        arr = IntArray(n)
        st = StringTokenizer(readLine())
        for (i in 0 until n) {
            arr[i] = st.nextToken().toInt()
        }

        Arrays.sort(arr)

        var flag: Boolean = false
        for (i in 1 until n) {
            if (arr[i] - arr[i - 1] > 1) {
                sb.append("NO")
                flag = true
                break
            }
        }

        if (!flag) {
            sb.append("YES")
        }
        sb.append('\n')
    }
    print(sb)
}