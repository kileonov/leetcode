package intro

fun findPeakElement(nums: IntArray): Int {
    var l = 0
    var h = nums.lastIndex

    while (l < h) {
        val mid = l + (h - l) / 2
        if (nums[mid] > nums[mid + 1]) {
            h = mid
        } else {
            l = mid + 1
        }
    }

    return l
}
