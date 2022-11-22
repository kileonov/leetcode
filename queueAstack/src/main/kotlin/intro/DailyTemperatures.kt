package intro

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size) { 0 }

    val stack = mutableListOf<Int>()
    for (i in temperatures.indices) {
        while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
            val dayWithLowerTemp = stack.removeAt(stack.lastIndex)
            result[dayWithLowerTemp] = i - dayWithLowerTemp
        }
        stack += i
    }
    return result
}