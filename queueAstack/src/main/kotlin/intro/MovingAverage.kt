package intro

import java.util.Deque
import java.util.LinkedList

class MovingAverage(size: Int) {

    private val dequeue: Deque<Int> = LinkedList()
    private val capacity = size
    private var slidingSum = 0

    fun next(`val`: Int): Double {
        slidingSum -= if (dequeue.size >= capacity) dequeue.removeFirst() else 0
        dequeue.addLast(`val`)
        slidingSum += `val`
        return slidingSum.toDouble() / dequeue.size
    }
}