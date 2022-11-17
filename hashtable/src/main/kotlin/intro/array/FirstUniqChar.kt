package intro.array

fun firstUniqChar(s: String): Int {
    val chToCounter = mutableMapOf<Char, Int>().withDefault { 0 }
    s.forEach { chToCounter[it] = chToCounter.getValue(it) + 1 }

    s.forEachIndexed { index, c ->
        if (chToCounter.getValue(c) == 1) return index
    }

    return -1
}