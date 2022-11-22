package intro

fun findTargetSumWays(nums: IntArray, target: Int): Int {

    fun dfs(nums: IntArray, target: Int, idx: Int): Int {
        if (idx >= nums.size) {
            return if (nums.sum() == target) 1 else 0
        }

        var sum = 0
        sum += dfs(nums, target, idx + 1)

        nums[idx] = -nums[idx]
        sum += dfs(nums, target, idx + 1)
        nums[idx] = -nums[idx]

        return sum
    }

    return dfs(nums, target, 0)
}