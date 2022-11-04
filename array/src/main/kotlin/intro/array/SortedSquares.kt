package intro.array

import kotlin.math.abs

fun sortedSquares(nums: IntArray): IntArray {
    val squaredArray = IntArray(nums.size)

    var negativesIdx = 0
    var positivesIdx = nums.lastIndex

    for (i in nums.lastIndex downTo 0) {
        var squared: Int
        if (abs(nums[negativesIdx]) > abs(nums[positivesIdx])) {
            squared = nums[negativesIdx]
            negativesIdx++
        } else {
            squared = nums[positivesIdx]
            positivesIdx--
        }
        squaredArray[i] = squared * squared
    }

    return squaredArray
}