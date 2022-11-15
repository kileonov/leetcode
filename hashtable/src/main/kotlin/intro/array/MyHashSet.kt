package intro.array

import java.util.LinkedList

class MyHashSet {

    companion object {
        private const val SIZE = 10_000
    }

    private val set: Array<MutableList<Int>> = Array(SIZE) { LinkedList<Int>() }
    private val hashcode: (Int) -> Int = { it.hashCode() % SIZE }

    fun add(key: Int) {
        if (contains(key)) return

        set[hashcode(key)].add(key)
    }

    fun remove(key: Int) {
        set[hashcode(key)].remove(key)
    }

    fun contains(key: Int): Boolean {
        return set[hashcode(key)].contains(key)
    }
}