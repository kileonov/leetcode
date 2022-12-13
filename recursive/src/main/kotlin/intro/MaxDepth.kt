package intro

import kotlin.math.max

fun maxDepth(root: TreeNode?): Int {

    fun maxDepthRec(root: TreeNode?): Int {
        if (root == null) return 0

        val left = maxDepthRec(root.left)
        val right = maxDepthRec(root.right)

        return max(left, right) + 1
    }

    return maxDepthRec(root)
}