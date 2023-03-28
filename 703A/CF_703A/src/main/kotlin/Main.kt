import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var mCnt = 0
    var cCnt = 0

    var n = readLine().toInt()
    for (i in 0 until n) {
        var st = StringTokenizer(readLine())
        var m = st.nextToken().toInt()
        var c = st.nextToken().toInt()
        if (m > c) {
            mCnt++
        } else if (m < c) {
            cCnt++
        }
    }

    if (mCnt == cCnt) {
        println("Friendship is magic!^^")
    } else if (mCnt > cCnt) {
        println("Mishka")
    } else {
        println("Chris")
    }
}

fun main() {
    solution()
}