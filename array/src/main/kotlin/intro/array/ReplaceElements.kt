package intro.array

import kotlin.math.max

fun replaceElements(arr: IntArray): IntArray {
    var max = -1

    for (i in arr.lastIndex downTo 0) {
        val temp = arr[i]
        arr[i] = max
        max = max(max, temp)
    }

    return arr
}