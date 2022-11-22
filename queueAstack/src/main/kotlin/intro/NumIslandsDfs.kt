package intro

private val DIRECTIONS = listOf(
    0 to -1, // left
    0 to 1, // right
    -1 to 0, // top
    1 to 0 // bot
)

fun numIslandsDfs(grid: Array<CharArray>): Int {

    fun dfs(grid: Array<CharArray>, cell: Int, row: Int) {
        if (
            cell < 0 ||
            row < 0 ||
            cell > grid.lastIndex ||
            row > grid[0].lastIndex ||
            grid[cell][row] == '0'
        ) {
            return
        }

        grid[cell][row] = '0'
        for (direction in DIRECTIONS) {
            val updtCell = cell + direction.first
            val updtRow = row + direction.second
            dfs(grid, updtCell, updtRow)
        }
    }

    var count = 0
    for (cell in grid.indices) {
        for (row in grid[cell].indices) {
            if (grid[cell][row] == '1') {
                count++
                dfs(grid, cell, row)
            }
        }
    }

    return count
}