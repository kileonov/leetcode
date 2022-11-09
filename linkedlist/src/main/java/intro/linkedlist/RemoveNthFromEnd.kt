package intro.linkedlist

class RemoveNthFromEnd {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var fastNode = head

        for (i in 0 until n) {
            fastNode = fastNode?.next
        }

        if (fastNode == null) return head?.next

        var slowNode = head

        while (fastNode?.next != null) {
            fastNode = fastNode.next
            slowNode = slowNode?.next
        }

        slowNode?.next = slowNode?.next?.next

        return head
    }
}