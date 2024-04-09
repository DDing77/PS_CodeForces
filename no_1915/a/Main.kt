package no_1915.a

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val sb = java.lang.StringBuilder()

fun main() {

    var n: Int = br.readLine().toInt();
    while (n-- > 0) {
        var map: HashMap<Int, Int> = HashMap()
        val st = StringTokenizer(br.readLine())

        for (i in 0..2) {
            val cur = st.nextToken().toInt()
            map[cur] = map.getOrDefault(cur, 0) + 1
        }

        for (mutableEntry in map) {
            if (mutableEntry.value == 1) {
                sb.append(mutableEntry.key).append("\n")
            }
        }
    }
    print(sb)
}