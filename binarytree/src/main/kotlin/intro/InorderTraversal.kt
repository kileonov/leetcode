package intro

import ds.TreeNode

fun main() {
    println(
        inorderTraversalRec(
            TreeNode(1).apply {
                right = TreeNode(2).apply {
                    left = TreeNode(3)
                }
            }
        )
    )
}

fun inorderTraversalRec(root: TreeNode?): List<Int> {

    fun inorderTraversalRec(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) return

        root.left?.let { inorderTraversalRec(it, result) }
        result += root.`val`
        root.right?.let { inorderTraversalRec(it, result) }
    }

    return mutableListOf<Int>().apply { inorderTraversalRec(root, this) }
}


fun inorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()

    val result = mutableListOf<Int>()
    val queue = ArrayDeque<TreeNode>()
    var curr: TreeNode? = root

    while (curr != null || queue.isNotEmpty()) {
        while (curr != null) {
            queue.addFirst(curr)
            curr = curr.left
        }

        curr = queue.removeFirst()
        result += curr.`val`
        curr = curr.right
    }

    return result
}

