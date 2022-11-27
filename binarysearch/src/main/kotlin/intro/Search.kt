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