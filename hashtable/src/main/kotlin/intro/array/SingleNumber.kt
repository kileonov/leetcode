package intro.array

    fun singleNumber(nums: IntArray): Int {
        val numToCount = mutableMapOf<Int, Int>()

        nums.forEach {
            if (!numToCount.contains(it)) numToCount[it] = 0
            numToCount[it] = numToCount.getValue(it) + 1
        }

        numToCount.forEach { (key, value) -> if (value == 1) return key }

        return -1
    }