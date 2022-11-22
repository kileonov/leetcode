package intro

import kotlin.math.min

class MinStack() {

    private val stack: MutableList<Int> = mutableListOf()
    private val mins: MutableList<Int> = mutableListOf()

    fun push(`val`: Int) {
        mins += if (mins.isEmpty()) `val` else min(`val`, mins.last())
        stack += `val`
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
        mins.removeAt(mins.lastIndex)
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return mins.last()
    }
}