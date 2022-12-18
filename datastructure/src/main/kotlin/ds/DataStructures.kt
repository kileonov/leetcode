package ds

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(`val`=$`val`)"
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String {
        return "TreeNode(`val`=$`val`)"
    }
}