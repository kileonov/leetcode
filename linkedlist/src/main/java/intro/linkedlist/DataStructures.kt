package intro.linkedlist

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }
}

fun connectNodes(array: IntArray): ListNode? {
    if (array.isEmpty()) {
        return null
    }

    var head: ListNode? = null
    var node: ListNode? = null
    for (el in array) {
        if (node == null) {
            head = ListNode(el)
            node = head
        } else {
            node.next = ListNode(el)
            node = node.next
        }
    }

    return head
}
