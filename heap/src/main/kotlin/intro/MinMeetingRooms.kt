package intro

import java.util.PriorityQueue

fun minMeetingRooms(intervals: Array<IntArray>): Int {
    val sortedSchedules: List<IntArray> = intervals.sortedWith(
        object : Comparator<IntArray> {
            override fun compare(next: IntArray, prev: IntArray): Int =
                next[0].compareTo(prev[0])
        }
    )

    val heap = PriorityQueue<Int>()
    heap.offer(sortedSchedules[0][1])
    for (i in 1..sortedSchedules.lastIndex) {
        if (heap.peek() <= sortedSchedules[i][0]) heap.poll()
        heap.offer(sortedSchedules[i][1])
    }
    return heap.size
}