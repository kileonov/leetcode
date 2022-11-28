package intro

fun guessNumber(n: Int): Int {
    var l = 1
    var h = n

    while (l <= h) {
        val mid = l + (h - l) / 2
        when (guess(mid)) {
            -1 -> h = mid - 1
            1 -> l = mid + 1
            else -> return mid
        }
    }

    return -1
}

fun guess(num: Int): Int = -1