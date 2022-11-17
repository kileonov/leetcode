package intro.array

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val indicesSet = HashSet<Int>(k + 1)

    for ((index, num) in nums.withIndex()) {
        if (indicesSet.contains(num)) return true
        indicesSet += num
        if (indicesSet.size > k) {
            indicesSet.remove(nums[index - k])
        }
    }

    return false
}