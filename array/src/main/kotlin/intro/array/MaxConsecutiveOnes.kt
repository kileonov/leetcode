package intro.array

import kotlin.math.max

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var previousOneCounter = 0
    var currentOneCounter = 0

    for (num in nums) {
        if (num == 1) {
            currentOneCounter++
        } else {
            previousOneCounter = max(previousOneCounter, currentOneCounter)
            currentOneCounter = 0
        }
    }

    return max(previousOneCounter, currentOneCounter)
}
