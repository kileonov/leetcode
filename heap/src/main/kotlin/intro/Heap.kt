package intro

import kotlin.math.min

private class Heap(capacity: Int) {

    companion object { private const val ROOT = 1 }

    private val heap = IntArray(capacity + 1).apply { this[0] = Int.MIN_VALUE }
    private val capacity = heap.size
    private var idx = 1
    val size: Int
        get() = idx - 1
    private val isFull: Boolean
        get() = idx >= capacity
    private val isEmpty: Boolean
        get() = idx - 1 == 0

    fun offer(value: Int) {
        if (isFull) return

        heap[idx] = value
        siftUp()
        idx++
    }

    fun peek(): Int {
        if (isEmpty) return Int.MIN_VALUE
        return heap[ROOT]
    }

    fun poll(): Int {
        if (isEmpty) return Int.MIN_VALUE

        val root = heap[ROOT]

        heap[ROOT] = heap[--idx]
        siftDown()
        return root
    }

    private fun siftUp() {
        var currIdx = idx
        var parentIdx = currIdx / 2
        while (heap[parentIdx] > heap[currIdx] && currIdx > ROOT) {
            swap(parentIdx, currIdx)
            currIdx = parentIdx
            parentIdx = currIdx / 2
        }
    }

    private fun siftDown() {
        var currIdx = ROOT
        while (idx > currIdx * 2) {
            val leftIdx = currIdx * 2
            val rightIdx = currIdx * 2 + 1

            when (min(heap[currIdx], min(heap[leftIdx], if (idx > rightIdx) heap[rightIdx] else Int.MAX_VALUE))) {
                heap[currIdx] -> return
                heap[leftIdx] -> {
                    swap(currIdx, leftIdx)
                    currIdx = leftIdx
                }
                heap[rightIdx] -> {
                    swap(currIdx, rightIdx)
                    currIdx = rightIdx
                }
            }
        }
    }

    private fun swap(parentIdx: Int, currIdx: Int) {
        val temp = heap[parentIdx]
        heap[parentIdx] = heap[currIdx]
        heap[currIdx] = temp
    }
}
