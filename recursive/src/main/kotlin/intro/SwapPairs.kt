package intro

private class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`)"
    }
}

private fun swapPairs(head: ListNode?): ListNode? {

    fun swapPairsRec(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        val firstNode = head
        val secondNode = head.next!!

        firstNode.next = swapPairsRec(secondNode.next)
        secondNode.next = firstNode

        return secondNode
    }

    return swapPairsRec(head)
}