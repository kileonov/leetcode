package intro.string

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    nums.sortDescending()
    var sum = 0

    for (i in nums.indices) {
        sum += nums[i]
        if (sum >= target) return i + 1
    }

    return 0
}