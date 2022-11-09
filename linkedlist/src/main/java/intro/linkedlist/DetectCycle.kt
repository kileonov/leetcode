package intro.linkedlist

class DetectCycle {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun detectCycle(head: ListNode?): ListNode? {
        var slowPointer = head
        var fastPointer = head

        var hasCycle = false
        while(fastPointer?.next?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next

            if (slowPointer == fastPointer) {
                hasCycle = true
                break
            }
        }

        if (!hasCycle) return null

        var node = head
        while (node != slowPointer) {
            node = node?.next
            slowPointer = slowPointer?.next
        }
        return node
    }
}