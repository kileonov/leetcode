package intro.array

import java.util.LinkedList

class MyHashMap {

    class Node(val key: Int, val value: Int)

    companion object {
        const val SIZE = 10_000
    }

    private val map: Array<MutableList<Node>> = Array(SIZE) { LinkedList<Node>() }
    private val hashcode: (Int) -> Int = { it.hashCode() % SIZE }

    fun put(key: Int, value: Int) {
        val node = Node(key, value)
        remove(key)
        map[hashcode(key)].add(node)
    }

    fun get(key: Int): Int {
        return map[hashcode(key)].find { it.key == key }?.value ?: -1
    }

    fun remove(key: Int) {
        map[hashcode(key)].removeIf { it.key == key }
    }
}