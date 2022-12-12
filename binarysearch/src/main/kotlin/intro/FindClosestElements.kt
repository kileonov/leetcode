package intro

import kotlin.math.abs

fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
    if (arr.isEmpty()) return emptyList()

    var l = 0
    var h = arr.size

    while (l < h) {
        val mid = l + (h - l) / 2
        if (arr[mid] >= x) {
            h = mid
        } else {
            l = mid + 1
        }
    }

    var ln = l - 1
    var rn = l

    while (rn - ln - 1 < k) {
        if (ln < 0) {
            rn++
        } else if (rn > arr.lastIndex) {
            ln--
        } else {
            if (abs(arr[ln] - x) <= abs(arr[rn] - x)) ln-- else rn++
        }
    }

    val result = mutableListOf<Int>()
    for (i in (ln + 1) until rn) {
        result += arr[i]
    }

    return result
}