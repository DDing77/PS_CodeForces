import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder();
    var t = readLine().toInt()

    while (t-- > 0) {
        var peoples = mutableListOf<Int>()
        readLine().split(" ").map {
            peoples.add(it.toInt())
        }

        var target = peoples[0]

        peoples.sortDescending()

        sb.append(peoples.indexOf(target)).append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}