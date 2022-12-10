package intro

fun findMin(nums: IntArray): Int {
    var l = 0
    var h = nums.lastIndex

    while (l < h) {
        val mid = l + (h - l) / 2

        when {
            nums[l] <= nums[mid] -> {
                if (nums[mid] > nums[h]) l = mid + 1
                else h = mid
            }
            nums[mid] <= nums[h] -> {
                if (nums[mid] < nums[l]) h = mid
                else l = mid + 1
            }
        }
    }

    return nums[l]
}