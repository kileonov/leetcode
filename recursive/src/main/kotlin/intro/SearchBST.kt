package intro

tailrec fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null || root.`val` == `val`) return root

    return if (`val` < root.`val`) searchBST(root.left, `val`) else searchBST(root.right, `val`)
}