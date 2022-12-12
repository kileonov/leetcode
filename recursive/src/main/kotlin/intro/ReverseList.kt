package intro

fun reverseList(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    val tail = reverseList(head.next)

    head.next?.next = head
    head.next = null

    return tail
}