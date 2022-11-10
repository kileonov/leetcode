package intro.linkedlist

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    var pointerA: ListNode? = headA
    var pointerB: ListNode? = headB

    while (pointerA != pointerB) {
        pointerA = if (pointerA == null) headB else pointerA.next
        pointerB = if (pointerB == null) headA else pointerB.next
    }

    return pointerA
}
