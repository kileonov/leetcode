package intro

import java.util.PriorityQueue

fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
    val laddersHeap = PriorityQueue<Int>()

    var currentBricks = bricks
    for (i in 0 until heights.lastIndex) {
        val diff = heights[i + 1] - heights[i]
        if (diff <= 0) continue

        laddersHeap.offer(diff)
        if (laddersHeap.size <= ladders) continue

        currentBricks -= laddersHeap.poll()
        if (currentBricks < 0) return i
    }
    return heights.lastIndex
}