package intro.string

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var leftIdx = 0
    var rightIdx = numbers.lastIndex

    while (leftIdx < rightIdx) {
        val sum = numbers[leftIdx] + numbers[rightIdx]
        if (sum == target) return intArrayOf(leftIdx + 1, rightIdx + 1)
        else if (sum < target) leftIdx++
        else rightIdx--
    }

    return intArrayOf()
}