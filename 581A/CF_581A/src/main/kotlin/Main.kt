import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer

    st = StringTokenizer(br.readLine());
    var a: Int = st.nextToken().toInt();
    var b: Int = st.nextToken().toInt();

    var min = Math.min(a, b);
    var resA: Int = 0
    var resB: Int = 0;

    resA += min;

    a -= min;
    b -= min;

    resB += a / 2
    resB += b / 2

    println("$resA $resB");
}