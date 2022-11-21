package intro

import java.util.LinkedList

private const val GATE = 0
private const val EMPTY_ROOM = Int.MAX_VALUE
// col to row
private val DIRECTIONS = listOf(
    0 to -1, // left
    0 to 1, // right
    -1 to 0, // top
    1 to 0 // bot
)

    fun wallsAndGates(rooms: Array<IntArray>): Unit {
        val maxCol = rooms.size
        val maxRow = rooms[0].size

        val roomsToVisit = LinkedList<Pair<Int, Int>>()
        for (i in rooms.indices) {
            for (j in rooms[i].indices) {
                if (rooms[i][j] == GATE) roomsToVisit += i to j
            }
        }

        while (roomsToVisit.isNotEmpty()) {
            val (col, row) = roomsToVisit.pop()
            for (dir in DIRECTIONS) {
                val colRoomToVisit = col + dir.first
                val rowRoomToVisit = row + dir.second
                if (
                    colRoomToVisit < 0 ||
                    rowRoomToVisit < 0 ||
                    colRoomToVisit >= maxCol ||
                    rowRoomToVisit >= maxRow ||
                    rooms[colRoomToVisit][rowRoomToVisit] != EMPTY_ROOM
                ) {
                    continue
                }

                rooms[colRoomToVisit][rowRoomToVisit] = rooms[col][row] + 1
                roomsToVisit += colRoomToVisit to rowRoomToVisit
            }
        }
    }