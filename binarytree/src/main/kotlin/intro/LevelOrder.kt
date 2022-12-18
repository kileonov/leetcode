package intro

import ds.TreeNode
import java.util.LinkedList

fun levelOrder(root: TreeNode?): List<List<Int>> {
    if (root == null) return emptyList()

    val result = mutableListOf<MutableList<Int>>()
    val queue = LinkedList<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        result += mutableListOf<Int>()
        val nextLvl = LinkedList<TreeNode>()

        while (queue.isNotEmpty()) {
            val node = queue.remove()
            result.last() += node.`val`

            node.left?.let { nextLvl += it }
            node.right?.let { nextLvl += it }
        }

        queue += nextLvl
    }

    return result
}