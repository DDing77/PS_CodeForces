import java.io.BufferedReader
import java.io.InputStreamReader

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var nums = mutableListOf<Int>()
        readLine().split(" ").map { nums.add(it.toInt()) }

        nums.sort()
        if (nums[0] + nums[1] == nums[2]) {
            sb.append("YES")
        } else {
            sb.append("NO")
        }

        sb.append('\n')
    }
    print(sb)
}

fun main() {
    solution()
}