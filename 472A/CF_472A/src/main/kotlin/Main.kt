import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var primes: BooleanArray = BooleanArray(1000001)
    primes[0] = true
    primes[1] = true

    for (i in 2..Math.sqrt(1000000.0).toInt()) {
        if (!primes[i]) {
            for (j in i * 2..1000000 step (i)) {
                primes[j] = true
            }
        }
    }

    var N = readLine().toInt()

    for (i in 4..N / 2) {
        if (primes[i] && primes[N - i]) {
            println("$i ${N - i}")
            return
        }
    }
}