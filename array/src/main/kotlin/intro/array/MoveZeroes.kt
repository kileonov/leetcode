package intro.array

fun moveZeroes(nums: IntArray): Unit {
    var writerIdx = 0

    for (readerIdx in nums.indices) {
        if (nums[writerIdx] != 0) {
            writerIdx++
            continue
        }
        if (nums[readerIdx] != 0) {
            val temp = nums[writerIdx]
            nums[writerIdx] = nums[readerIdx]
            nums[readerIdx] = temp

            writerIdx++
        }
    }
}