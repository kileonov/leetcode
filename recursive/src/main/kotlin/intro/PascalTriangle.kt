package intro

fun getRow(rowIndex: Int): List<Int> {

    fun getRowRec(i: Int, j: Int, map: MutableMap<Pair<Int, Int>, Int>): Int {
        if (i <= 0 || j <= 0 || j == i) return 1
        if (map.containsKey(i to j)) return map.getValue(i to j)

        val topLeft = getRowRec(i - 1, j - 1, map)
        val topRight = getRowRec(i - 1, j, map)

        val result = topLeft + topRight
        map[i to j] = result

        return result
    }

    val result = mutableListOf<Int>()
    for (i in 0..rowIndex) {
        result += getRowRec(rowIndex, i, hashMapOf())
    }
    return result
}