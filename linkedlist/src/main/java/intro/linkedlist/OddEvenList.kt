package intro.linkedlist

fun oddEvenList(head: ListNode?): ListNode? {
    if (head == null) return null

    var oddNode: ListNode = head
    var evenNode: ListNode? = head.next
    val evenHead: ListNode? = evenNode

    while (evenNode?.next != null) {
        oddNode.next = evenNode.next
        oddNode = oddNode.next!!

        evenNode.next = oddNode.next
        evenNode = evenNode.next
    }

    oddNode.next = evenHead

    return head
}