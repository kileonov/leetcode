package intro.array

fun sortArrayByParity(nums: IntArray): IntArray {
    var writerIdx = 0

    for (readerIdx in nums.indices) {
        if (nums[readerIdx] % 2 == 0) {
            val temp = nums[writerIdx]
            nums[writerIdx] = nums[readerIdx]
            nums[readerIdx] = temp

            writerIdx++
        }
    }

    return nums
}