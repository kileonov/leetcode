package intro

import java.util.LinkedList
import kotlin.math.max

fun main() {
    println(
        numIslands(
            arrayOf(
                charArrayOf('1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '0', '0', '0'),
            )
        )
    )

    println(
        numIslands(
            arrayOf(
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('1', '1', '0', '0', '0'),
                charArrayOf('0', '0', '1', '0', '0'),
                charArrayOf('0', '0', '0', '1', '1'),
            )
        )
    )
}

private const val LAND = 1
private val DIRECTIONS = listOf(
    0 to 1,  // right
    0 to -1, // left
    -1 to 0, // bot
    1 to 0   // top
)

fun numIslands(grid: Array<CharArray>): Int {
    val maxCell = grid.size
    val maxRow = grid[0].size

    val queue = LinkedList<Pair<Int, Int>>()
    val matrix = Array(maxCell) { IntArray(maxRow) }
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            matrix[i][j] = Character.getNumericValue(grid[i][j])
        }
    }

    var acc = 10
    for (cell in matrix.indices) {
        for (row in matrix[cell].indices) {
            if (matrix[cell][row] == LAND) {
                matrix[cell][row] = ++acc
                queue += cell to row
            }

            while (queue.isNotEmpty()) {
                val el = queue.pop()

                for (dir in DIRECTIONS) {
                    val updtCell = el.first + dir.first
                    val updtRow = el.second + dir.second

                    if (
                        updtCell < 0 ||
                        updtRow < 0 ||
                        updtCell >= maxCell ||
                        updtRow >= maxRow ||
                        matrix[updtCell][updtRow] != LAND
                    ) {
                        continue
                    }

                    matrix[updtCell][updtRow] = matrix[cell][row]
                    queue += updtCell to updtRow
                }
            }
        }
    }

    var max = 0
    for (row in matrix) {
        for (num in row) {
            max = max(max, num)
        }
    }

    return if (max == 0) 0 else  max - 10
}