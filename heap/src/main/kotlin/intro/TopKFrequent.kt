package intro

import java.util.PriorityQueue

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val numToCount = hashMapOf<Int, Int>()
    nums.forEach { numToCount[it] = numToCount.getOrDefault(it, 0) + 1 }

    // first - value, second - counter
    val heap = PriorityQueue<Int> { o1, o2 -> numToCount.getValue(o1) - numToCount.getValue(o2) }
    numToCount.keys.forEach { num ->
        heap.offer(num)
        if (heap.size > k) {
            heap.poll()
        }
    }

    return heap.toIntArray()
}