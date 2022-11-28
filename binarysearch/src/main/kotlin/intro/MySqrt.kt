package intro

fun mySqrt(x: Int): Int {
    if (x < 2) return x

    var l = 2
    var h = x / 2 + 1
    while (l < h) {
        val mid = (l + h) / 2
        val mult = mid.toLong() * mid
        when {
            mult < x -> l = mid + 1
            mult > x -> h = mid
            else -> return mid
        }
    }

    return l - 1
}