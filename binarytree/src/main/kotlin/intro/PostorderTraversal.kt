package intro

import ds.TreeNode

fun postorderTraversalRec(root: TreeNode?): List<Int> {

    fun postorderTraversalRec(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) return

        root.left?.let { postorderTraversalRec(it, result) }
        root.right?.let { postorderTraversalRec(it, result) }
        result += root.`val`
    }

    return mutableListOf<Int>().apply { postorderTraversalRec(root, this) }
}