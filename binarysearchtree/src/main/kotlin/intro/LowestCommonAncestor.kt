package intro

import ds.TreeNode

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    val pVal = p!!.`val`
    val qVal = q!!.`val`
    var node: TreeNode? = root
    while (node != null) {
        val nodeVal = node.`val`

        node = if (nodeVal > pVal && nodeVal > qVal) {
            node.left
        } else if (nodeVal < pVal && nodeVal < qVal) {
            node.right
        } else {
            return node
        }
    }

    return null
}