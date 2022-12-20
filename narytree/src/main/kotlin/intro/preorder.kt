package intro

import ds.Node

fun preorderRec(root: Node?): List<Int> {

    fun preorderRec(root: Node?, result: MutableList<Int>) {
        if (root == null) return

        result += root.`val`
        for (child in root.children) {
            preorderRec(child, result)
        }
    }

    return mutableListOf<Int>().apply { preorderRec(root, this) }
}

fun preorder(root: Node?): List<Int> {
    if (root == null) return emptyList()

    val result = mutableListOf<Int>()
    val queue = ArrayDeque<Node>()
    queue.addFirst(root)
    while (queue.isNotEmpty()) {
        val node = queue.removeFirst()
        result += node.`val`

        for (i in node.children.lastIndex downTo 0) {
            node.children[i]?.let { queue.addFirst(it) }
        }
    }

    return result
}