package intro.array

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numToIdx = mutableMapOf<Int, Int>()

    for ((idx, num) in nums.withIndex()) {
        val acc = target - num
        if (numToIdx.contains(acc)) return intArrayOf(idx, numToIdx.getValue(acc))
        numToIdx[num] = idx
    }

    return intArrayOf()
}