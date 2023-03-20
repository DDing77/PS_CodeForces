import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

var n: Int = 0
var resA: Int = 0
var resB: Int = 0
lateinit var cards: IntArray

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st: StringTokenizer

    n = readLine().toInt()
    cards = IntArray(n)

    st = StringTokenizer(readLine())
    for (i in 0 until n) {
        cards[i] = st.nextToken().toInt()
    }

    var left = 0
    var right = n - 1
    var turn = false
    while (n > 0) {
        if (cards[left] > cards[right]) {
            if (!turn) {
                resA += cards[left++]
                turn = true
            } else {
                resB += cards[left++]
                turn = false
            }
        } else {
            if (!turn) {
                resA += cards[right--]
                turn = true
            } else {
                resB += cards[right--]
                turn = false
            }
        }
        n--
    }
    println("$resA $resB")
}

fun main() {
    solution()
}
