package intro

import java.util.PriorityQueue

fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
    val heap = PriorityQueue<Pair<Int, Int>> { next, prev ->
        matrix[next.first][next.second] - matrix[prev.first][prev.second]
    }
    matrix.indices.forEach {
        heap.offer(it to 0)
    }

    repeat(k - 1) {
        val head = heap.poll()
        if (head.second < matrix.lastIndex) {
            heap.offer(head.first to head.second + 1)
        }
    }

    return with(heap.poll()) {
        matrix[first][second]
    }
}