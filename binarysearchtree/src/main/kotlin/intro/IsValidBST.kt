package intro

import ds.TreeNode

fun isValidBST(root: TreeNode?): Boolean {

    fun isValidBSTRec(root: TreeNode?, low: Int?, high: Int?): Boolean {
        if (root == null) return true

        if ((low != null && root.`val` <= low) ||
            (high != null && root.`val` >= high)
        ) return false

        return isValidBSTRec(root.left, low, root.`val`) && isValidBSTRec(root.right, root.`val`, high)
    }

    return isValidBSTRec(root, null, null)
}