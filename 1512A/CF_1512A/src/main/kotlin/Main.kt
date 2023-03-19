import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder();
    var st: StringTokenizer
    var t: Int
    var n: Int
    var arr: IntArray

    t = readLine().toInt()
    while (t-- > 0) {
        n = readLine().toInt()
        arr = IntArray(n)
        st = StringTokenizer(readLine())
        for (i in 0 until n) {
            arr[i] = st.nextToken().toInt()
        }

        if (arr[0] != arr[1]) {
            if (arr[0] == arr[2]) {
                sb.append(2)
            } else {
                sb.append(1)
            }
        } else if (arr[n - 2] != arr[n - 1]) {
            if (arr[n - 1] == arr[n - 3]) {
                sb.append(n - 1)
            } else {
                sb.append(n)
            }
        } else {
            for (i in 1 until n - 1) {
                if (arr[i - 1] == arr[i + 1] && arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                    sb.append(i + 1)
                    break;
                }
            }
        }
        sb.append('\n');
    }
    print(sb)
}