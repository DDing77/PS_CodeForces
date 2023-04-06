import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var res = 0;
    var calories = IntArray(4);

    var st = StringTokenizer(readLine())
    for (i in calories.indices) {
        calories[i] = st.nextToken().toInt()
    }

    var input = readLine()
    for (i in input.indices) {
        res += calories[input[i].digitToInt() - 1]
    }

    println(res)
}

fun main() {
    solution()
}