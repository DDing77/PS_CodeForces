import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sb: StringBuilder = StringBuilder()
    var tempSb: StringBuilder;
    var n: Int = readLine().toInt()

    while (n-- > 0) {
        var num: Int = readLine().toInt();
        var cnt: Int = 1;
        var length: Int = 0;
        tempSb = StringBuilder();
        while (num > 0) {
            if (num % 10 != 0) {
                length++;
                tempSb.append("${num % 10 * Math.pow(10.0, cnt - 1.toDouble()).toInt()} ");
            }
            cnt++;
            num /= 10;
        }
        sb.append(length).append('\n');
        sb.append(tempSb).append('\n');
    }
    print(sb)
}