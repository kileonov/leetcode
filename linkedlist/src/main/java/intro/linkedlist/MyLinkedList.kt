package intro.linkedlist

class MyLinkedList {

    var head: Node? = null
    var tail: Node? = null

    class Node {
        val value: Int
        var next: Node?

        constructor(value: Int, next: Node? = null) {
            this.value = value
            this.next = next
        }

        override fun toString(): String {
            return "Node(value=$value, next=$next)"
        }
    }

    fun get(index: Int): Int {
        if (index < 0) return -1

        var node = head
        var currentIdx = 0
        while (node != null && currentIdx != index) {
            node = node.next
            currentIdx++
        }

        return node?.value ?: -1
    }

    fun addAtHead(`val`: Int) {
        val node = Node(`val`, head)

        if (head == null && tail == null) {
            tail = node
        }

        head = node
    }

    fun addAtTail(`val`: Int) {
        val node = Node(`val`, null)

        if (head == null && tail == null) {
            head = node
        } else {
            tail?.next = node
        }

        tail = node
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index == 0) {
            addAtHead(`val`)
            return
        }

        var currentIdx = 0
        var prev: Node? = null
        var current: Node? = head

        while (current != null && currentIdx != index) {
            prev = current
            current = current.next

            currentIdx++
        }

        val node = Node(`val`, current)
        prev?.next = node

        if (prev == tail) {
            tail = prev?.next
        }
    }

    fun deleteAtIndex(index: Int) {
        if (index == 0) {
            val node = head?.next
            head?.next = null
            head = node
            return
        }

        var currentIdx = 0
        var prev: Node? = null
        var current: Node? = head

        while (current != null && currentIdx != index) {
            prev = current
            current = current.next

            currentIdx++
        }

        prev?.next = current?.next
        current?.next = null

        if (tail == current) {
            tail = prev
        }
    }
}