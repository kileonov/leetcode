package intro.linkedlist

fun main() {
    val nodes = connectNodes(intArrayOf(1, 2, 3, 5, 2, 1))

    val result = isPalindrome(nodes)

    println(result)
}

    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return false

        var node = head
        var counter = 0
        while (node != null) {
            counter++
            node = node.next
        }

        var lCounter = counter / 2
        var lprev: ListNode? = null
        var lcurrent: ListNode? = head
        while (lCounter != 0) {
            val temp = lcurrent?.next
            lcurrent?.next = lprev

            lprev = lcurrent
            lcurrent = temp

            lCounter--
        }

        var rcurrent = if (counter % 2 == 0) lcurrent else lcurrent?.next

        while (lprev != null && rcurrent != null) {
            if (lprev.`val` != rcurrent.`val`) return false

            lprev = lprev.next
            rcurrent = rcurrent.next
        }

        return true
    }

