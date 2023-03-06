import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())

    var n = st.nextToken().toInt()
    var m = st.nextToken().toInt()
    var res: Int = 0;

    st = StringTokenizer(readLine());

    var pre = 0;
    while (st.hasMoreTokens()) {
        var cur = st.nextToken().toInt();
        if (pre <= cur) {
            res += cur - pre;
        } else {
            res += (n - pre) + cur
        }
        pre = cur;
//        println("res = ${res}")
    }

    println(res - 1)
}