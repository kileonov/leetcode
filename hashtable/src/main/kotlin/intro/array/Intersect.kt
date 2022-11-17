package intro.array

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val numEntries = IntArray(1001) { 0 }
    nums1.forEach { numEntries[it] += 1 }

    val result = mutableListOf<Int>()
    nums2.forEach {
        if (numEntries[it] > 0) {
            result += it
            numEntries[it] -= 1
        }
    }
    return result.toIntArray()
}