import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n: Int = br.readLine().toInt()

    var cur: Int
    var remain: Int = 0
    var res: Int = 0

    var st = StringTokenizer(br.readLine())
    for (i: Int in 1..n) {
        cur = st.nextToken().toInt()
        if (cur == -1) {
            if (remain <= 0) {
                res++
            } else {
                remain--
            }
        } else {
            remain += cur
        }
    }

    println(res)
}
