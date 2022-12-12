package intro

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