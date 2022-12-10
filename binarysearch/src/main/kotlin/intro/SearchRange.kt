package intro

fun searchRange(nums: IntArray, target: Int): IntArray {
    if (nums.isEmpty()) return intArrayOf(-1, -1)
    val left = binaryLeftSearch(nums, target)
    if (left == -1) return intArrayOf(-1, -1)
    val right = binaryRightSearch(nums, target)
    return intArrayOf(left, right)
}

fun binaryLeftSearch(nums: IntArray, target: Int): Int {
    var l = 0
    var h = nums.size
    var leftMost = -1

    while (l < h) {
        val mid = l + (h - l) / 2
        when {
            nums[mid] == target -> {
                leftMost = mid
                h = mid
            }

            nums[mid] > target -> h = mid
            else -> l = mid + 1
        }
    }

    return leftMost
}

fun binaryRightSearch(nums: IntArray, target: Int): Int {
    var l = 0
    var h = nums.size
    var rightMost = -1

    while (l < h) {
        val mid = l + (h - l) / 2
        when {
            nums[mid] == target -> {
                rightMost = mid
                l = mid + 1
            }

            nums[mid] > target -> h = mid
            else -> l = mid + 1
        }
    }

    return rightMost
}
