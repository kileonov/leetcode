package intro.linkedlist

fun hasCycle(head: ListNode?): Boolean {
    var slowPointer = head
    var fastPointer = head

    while(fastPointer?.next?.next != null) {
        slowPointer = slowPointer?.next
        fastPointer = fastPointer.next?.next

        if (slowPointer != fastPointer) return true
    }

    return false
}
