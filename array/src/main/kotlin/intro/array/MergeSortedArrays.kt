package intro.array

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    merge(nums1, 3, intArrayOf(2,5,6), 3)

    println(nums1.contentToString())
}

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var idxM = m - 1
        var idxN = n - 1

        for (i in nums1.lastIndex downTo 0) {
            if (idxN < 0) break

            if (idxM >= 0 && nums1[idxM] > nums2[idxN]) {
                nums1[i] = nums1[idxM--]
            } else {
                nums1[i] = nums2[idxN--]
            }
        }
    }