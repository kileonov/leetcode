package intro.linkedlist

class HasCycle {

    internal class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    internal fun hasCycle(head: ListNode?): Boolean {
        var slowPointer = head
        var fastPointer = head

        while(fastPointer?.next?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next

            if (slowPointer != fastPointer) return true
        }

        return false
    }
}
