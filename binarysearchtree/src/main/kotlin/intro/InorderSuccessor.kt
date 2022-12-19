package intro

import ds.TreeNode

fun inorderSuccessorRec(root: TreeNode?, p: TreeNode?): TreeNode? {

    fun inorderSuccessorRec(node: TreeNode?, p: Int, successor: TreeNode?): TreeNode? {
        if (node == null) return successor

        return if (node.`val` > p) {
            inorderSuccessorRec(node.left, p, node)
        } else {
            inorderSuccessorRec(node.right, p, successor)
        }
    }

    return inorderSuccessorRec(root, p!!.`val`, null)
}

fun inorderSuccessor(root: TreeNode?, p: TreeNode?): TreeNode? {
    val pVal = p!!.`val`
    var successor: TreeNode? = null
    var node: TreeNode? = root
    while (node != null) {
        if (node.`val` > pVal) {
            successor = node
            node = node.left
        } else {
            node = node.right
        }
    }

    return successor
}