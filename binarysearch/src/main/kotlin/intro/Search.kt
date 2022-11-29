package intro

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size // right is not included

    while (left < right) {
        val mid = (left + right) / 2
        when {
            target == nums[mid] -> return mid
            target < nums[mid] -> right = mid
            else -> left = mid + 1
        }
    }

    return -1
}
fun searchRotated(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return -1

    var l = 0
    var h = nums.lastIndex
    while (l <= h) {
        val mid = (l + h) / 2
        if (nums[mid] == target) return mid
        when {
            nums[l] <= nums[mid] -> {
                if (target >= nums[l] && target < nums[mid]) h = mid - 1
                else l = mid + 1
            }
            nums[mid] <= nums[h] -> {
                if (target <= nums[h] && target > nums[mid]) l = mid + 1
                else h = mid - 1
            }
            else -> return -1
        }
    }

    return -1
}