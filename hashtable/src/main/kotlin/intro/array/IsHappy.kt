package intro.array

fun isHappy(n: Int): Boolean {
    val numToSqr = (0..9).associateWith { it * it }
    var counter = 0
    var num = n
    while (counter++ < 10000) {

        var sum = 0
        while (num > 0) {
            sum += numToSqr.getValue(num % 10)
            num /= 10
        }

        if (sum == 1) return true
        num = sum
    }

    return false
}