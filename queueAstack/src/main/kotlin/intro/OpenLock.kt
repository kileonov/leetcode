package intro

import java.util.LinkedList

fun openLock(deadends: Array<String>, target: String): Int {
    val dead = mutableSetOf<String>()
    deadends.forEach { dead += it }

    val queue = LinkedList<String?>()
    queue += "0000"
    queue += null

    val visited = mutableSetOf<String>()
    visited += "0000"

    var depth = 0
    while (queue.isNotEmpty()) {
        val combination = queue.pop()
        if (combination == null) {
            depth++
            if (queue.peek() != null) queue += null
        } else if (combination == target) {
            return depth
        } else if (combination !in dead) {
            for (i in 0..3) {
                for (d in -1..1 step 2) {
                    val y: Int = (combination[i] - '0' + d + 10) % 10
                    val newCombination = combination.substring(0, i) + ("" + y) + combination.substring(i + 1)

                    if (newCombination !in visited) {
                        visited += newCombination
                        queue += newCombination
                    }
                }
            }
        }
    }

    return -1
}