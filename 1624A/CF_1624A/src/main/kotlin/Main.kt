import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb = StringBuilder()
    var t = readLine().toInt()
    while (t-- > 0) {
        var n = readLine().toInt()
        var nums = IntArray(n);

        var st = StringTokenizer(readLine())
        for (i in nums.indices) {
            nums[i] = st.nextToken().toInt()
        }

        nums.sort()

        sb.append(nums[n - 1] - nums[0]).append('\n')
    }

    print(sb)
}

fun main() {
    solution()
}