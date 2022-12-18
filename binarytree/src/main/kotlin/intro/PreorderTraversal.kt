package intro

import ds.TreeNode
import java.util.ArrayDeque

fun preorderTraversalRec(root: TreeNode?): List<Int> {

    fun preorderTraversal(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) return

        result += root.`val`
        preorderTraversal(root.left, result)
        preorderTraversal(root.right, result)
    }

    return mutableListOf<Int>().apply { preorderTraversal(root, this) }
}

fun preorderTraversal(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
    val result = mutableListOf<Int>()

    val queue = ArrayDeque<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        result += node.`val`

        node.right?.let { queue.addFirst(it) }
        node.left?.let { queue.addFirst(it) }
    }

    return result
}
