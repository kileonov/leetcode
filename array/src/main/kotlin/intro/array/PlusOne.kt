package intro.array

fun plusOne(digits: IntArray): IntArray {
    val result = digits.copyOf()

    for (i in result.lastIndex downTo 0) {
        val sum = result[i] + 1

        result[i] = sum % 10

        if (sum <= 9) return result
    }

    val final = IntArray(result.size + 1)
    final[0] = 1
    for (i in result.indices) {
        final[i + 1] = result[i]
    }

    return final
}