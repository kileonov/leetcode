package intro.linkedlist

class GetIntersectionNode {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            return "ListNode(`val`=$`val`, next=$next)"
        }
    }

    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var pointerA: ListNode? = headA
        var pointerB: ListNode? = headB

        while (pointerA != pointerB) {
            pointerA = if (pointerA == null) headB else pointerA.next
            pointerB = if (pointerB == null) headA else pointerB.next
        }

        return pointerA
    }
}