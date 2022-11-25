package intro

import java.util.PriorityQueue

fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
    val heap = PriorityQueue<Pair<Int, IntArray>>(k + 1) { next, prev ->
        prev.first.compareTo(next.first)
    }

    for (point in points) {
        val distance = point[0] * point[0] + point[1] * point[1]
        heap.add(distance to point)
        if (heap.size > k) {
            heap.poll()
        }
    }

    return Array(k) { IntArray(2) }.apply {
        repeat(k) {
            this[it] = heap.poll().second
        }
    }
}