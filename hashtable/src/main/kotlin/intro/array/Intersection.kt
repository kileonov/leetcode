package intro.array

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val result = IntArray(1001) { -1 }

    nums1.forEach { result[it] = Int.MIN_VALUE }
    nums2.forEach {
        if (result[it] == Int.MIN_VALUE) {
            result[it] = it
        }
    }

    return result.filter { it != -1 && it != Int.MIN_VALUE }.toIntArray()
}