package intro.array

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var w = 0
    for (r in nums.indices) {
        if (nums[w] != nums[r]) {
            nums[++w] = nums[r]
        }
    }
    return w + 1
}