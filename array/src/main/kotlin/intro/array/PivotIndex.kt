package intro.array

fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()

    var leftSum = 0
    for ((index, num) in nums.withIndex()) {
        if (leftSum == sum - leftSum - num) return index

        leftSum += num
    }

    return -1
}