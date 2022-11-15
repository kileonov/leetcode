package intro.array

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()

    nums.forEach { num ->
        if (!set.add(num)) return true
    }

    return false
}
