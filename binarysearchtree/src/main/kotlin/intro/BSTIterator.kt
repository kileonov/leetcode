package intro

import ds.TreeNode

class BSTIterator(root: TreeNode?) {

    private val data = ArrayDeque<TreeNode>()

    init { traverseLeft(root) }

    private fun traverseLeft(node: TreeNode?) {
        var curr = node
        while (curr != null) {
            data.addFirst(curr)
            curr = curr.left
        }
    }

    fun next(): Int {
        val node = data.removeFirst()

        node.right?.let { traverseLeft(it) }

        return node.`val`
    }

    fun hasNext(): Boolean {
        return data.isNotEmpty()
    }
}