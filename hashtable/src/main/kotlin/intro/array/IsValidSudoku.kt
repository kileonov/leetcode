package intro.array

fun isValidSudoku(board: Array<CharArray>): Boolean {

    data class Matrix(val i: Int, val j: Int, val square: Int, val num: Int)

    fun isValid(i: Int, j: Int, nums: List<Matrix>): Boolean {
        return nums.none { it.i == i || it.j == j }
    }

    val sudoku = mutableMapOf<Int, MutableList<Matrix>>()
    var square: Int
    for ((i, ynums) in board.withIndex()) {
        square = i / 3 * 3

        for ((j, xnum) in ynums.withIndex()) {
            if (j != 0 && j % 3 == 0) square += 1
            if (xnum == '.') continue

            val num = Character.getNumericValue(xnum)
            if (!sudoku.containsKey(num)) {
                sudoku[num] = mutableListOf()
            } else {
                if (!isValid(i, j, sudoku.getValue(num))) return false
            }

            sudoku.getValue(num).add(Matrix(i, j, square, num))
        }
    }

    val squareToNums = sudoku.values.flatten().groupBy { it.square }
    for (sqNums in squareToNums.values) {
        val uniqueNums = mutableSetOf<Int>()
        val numsInSquare = sqNums.map { it.num }
        for (numInSquare in numsInSquare) {
            if (!uniqueNums.add(numInSquare)) return false
        }
    }

    return true
}
