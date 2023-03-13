import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st: StringTokenizer = StringTokenizer(readLine())
    var n: Int = st.nextToken().toInt()
    var k: Int = st.nextToken().toInt()
    var l: Int = st.nextToken().toInt()
    var c: Int = st.nextToken().toInt()
    var d: Int = st.nextToken().toInt()
    var p: Int = st.nextToken().toInt()
    var nl: Int = st.nextToken().toInt()
    var np: Int = st.nextToken().toInt()

    println(Math.min(k * l / nl, Math.min(c * d, p / np)) / n)
}