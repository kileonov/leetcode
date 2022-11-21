package intro

fun numSquares(n: Int): Int {
    val pSquares: List<Int> = (1..100).map { it * it }

    val queue = mutableSetOf<Int>()
    queue += n

    var lvl = 0
    while (queue.isNotEmpty()) {
        lvl++
        val nextQueue = mutableSetOf<Int>()

        for (reminder in queue) {
            for (pSquare in pSquares) {
                if (reminder == pSquare) {
                    return lvl
                } else if (reminder < pSquare) {
                    break
                } else {
                    nextQueue += reminder - pSquare
                }
            }
        }

        queue += nextQueue
    }

    return lvl
}