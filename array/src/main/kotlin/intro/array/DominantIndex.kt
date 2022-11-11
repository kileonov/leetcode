package intro.array

fun dominantIndex(nums: IntArray): Int {
    if (nums.isEmpty()) return -1

    var maxIdx = 0
    for ((i, _) in nums.withIndex()) {
        if (nums[maxIdx] < nums[i]) maxIdx = i
    }

    for ((i, num) in nums.withIndex()) {
        if (maxIdx != i && nums[maxIdx] < (num shl 1)) return -1
    }

    return maxIdx
}