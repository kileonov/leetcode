package intro

import java.util.PriorityQueue

fun findKthLargest(nums: IntArray, k: Int): Int {
    val heap = PriorityQueue<Int>()

    for (i in nums.indices) {
        heap.offer(nums[i])
        if (heap.size > k) {
            heap.poll()
        }
    }

    return heap.poll()
}