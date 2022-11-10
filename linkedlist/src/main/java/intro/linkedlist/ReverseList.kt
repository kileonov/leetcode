package intro.linkedlist

fun reverseList(head: ListNode?): ListNode? {
    var currentNode = head
    var prevNode: ListNode? = null

    while (currentNode != null) {
        val temp = currentNode.next
        currentNode.next = prevNode

        prevNode = currentNode
        currentNode = temp
    }

    return prevNode
}
