package intro.string

import java.lang.Integer.min

fun arrayPairSum(nums: IntArray): Int {
    nums.sort()

    var max = 0
    for (i in nums.indices step 2) {
        max += min(nums[i], nums[i + 1])
    }

    return max
}