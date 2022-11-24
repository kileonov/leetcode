package intro

import java.util.PriorityQueue

class KthLargest(private val k: Int, nums: IntArray) {

    private val heap = PriorityQueue<Int>(k + 1)

    init {
        nums.forEach { addToHeap(it) }
    }

    fun add(`val`: Int): Int {
        addToHeap(`val`)
        return heap.peek()
    }

    private fun addToHeap(it: Int) {
        heap.offer(it)
        if (heap.size > k) {
            heap.poll()
        }
    }
}