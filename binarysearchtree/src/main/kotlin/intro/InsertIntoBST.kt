package intro

import ds.TreeNode

fun insertIntoBSTRec(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return TreeNode(`val`)

    if (`val` > root.`val`) root.right = insertIntoBSTRec(root.right, `val`)
    else root.left = insertIntoBSTRec(root.left, `val`)

    return root
}

fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return TreeNode(`val`)

    var node = root
    while (node != null) {
        if (`val` > node.`val`) {
            if (node.right == null) {
                node.right = TreeNode(`val`)
                return root
            }
            node = node.right
        } else {
            if (node.left == null) {
                node.left = TreeNode(`val`)
                return root
            }
            node = node.left
        }
    }
    return root
}