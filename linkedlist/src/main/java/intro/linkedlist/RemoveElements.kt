package intro.linkedlist

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    var prevNode: ListNode? = null
    var currNode = head
    var newHead: ListNode? = null

    while (currNode != null) {
        if (currNode.`val` == `val`) {
            prevNode?.next = currNode.next
        } else {
            prevNode = currNode
        }

        currNode = currNode.next
        newHead = newHead ?: prevNode
    }

    return newHead
}
