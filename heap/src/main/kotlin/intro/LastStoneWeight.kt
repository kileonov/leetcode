package intro

import java.util.Collections
import java.util.PriorityQueue

fun lastStoneWeight(stones: IntArray): Int {
    val heap = PriorityQueue<Int>(stones.size, Collections.reverseOrder())
    stones.forEach { heap.offer(it) }

    while (heap.size > 1) {
        val stone1 = heap.poll()
        val stone2 = heap.poll()

        if (stone1 > stone2) {
            heap.offer(stone1 - stone2)
        }
    }

    return if (heap.isEmpty()) 0 else heap.poll()
}