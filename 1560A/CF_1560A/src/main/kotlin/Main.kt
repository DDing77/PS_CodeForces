import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var list = arrayListOf<Int>()

    var i = 1
    while (list.size < 1000) {
        if (!(i % 3 == 0 || i % 10 == 3)) {
            list.add(i)
        }
        i++
    }

    var t = readLine().toInt()
    while (t-- > 0) {
        sb.append(list.get(readLine().toInt() - 1)).append('\n')
    }

    println(sb)
}

fun main() {
    solution()
}