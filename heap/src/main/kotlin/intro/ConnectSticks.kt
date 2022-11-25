package intro

import java.util.PriorityQueue

fun connectSticks(sticks: IntArray): Int {
    val heap = PriorityQueue<Int>()
    sticks.forEach { heap.offer(it) }

    var cost = 0
    while (heap.size > 1) {
        val stick1 = heap.poll()
        val stick2 = heap.poll()
        val connectedStick = stick1 + stick2
        cost += connectedStick
        heap.offer(connectedStick)
    }
    return cost
}