package intro

import java.util.PriorityQueue

fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
    // calculate sum for each row in mat and put in a new array
    // idx of array = row and soldiers[idx] = row's sum
    val soldiers = IntArray(mat.size)
    mat.indices.forEach {
        soldiers[it] = mat[it].sum()
    }

    // heap with comparator to keep weakest K elements
    val maxHeap = PriorityQueue<Int>(k + 1) { next, previous ->
        if (soldiers[next] == soldiers[previous]) previous - next else soldiers[previous] - soldiers[next]
    }

    // by the end heap gonna have K weakest elements with "strongest" on the top
    for (i in soldiers.indices) {
        maxHeap.offer(i)
        if (maxHeap.size > k) {
            maxHeap.poll()
        }
    }

    // because "strongest" on the top, we simply reverse indices order, poll it and put in the end of result
    // repeat until we get all elements from heap (heap.size == k)
    return IntArray(k).apply {
        (indices.reversed()).forEach { this[it] = maxHeap.poll() }
    }
}