package intro.array

import kotlin.math.abs

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val numToEntries = HashMap<Int, Int>(nums.size)

    for ((index, num) in nums.withIndex()) {
        if (numToEntries.containsKey(num)) {
            if (abs(numToEntries.getValue(num) - index) <= k) return true
        }
        numToEntries[num] = index
    }

    return false
}