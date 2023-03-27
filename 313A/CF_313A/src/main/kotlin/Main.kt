import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var input = readLine().toInt()
    if (input < 0) {
        if (input >= -10) {
            input = 0
        } else {
            input = (input / 10).coerceAtLeast(input / 100 * 10 + (input % 10))
        }
    }

    println(input)
}

fun main() {
    solution()
}