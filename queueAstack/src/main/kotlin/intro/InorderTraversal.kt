package intro

private class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

private fun inorderTraversal(root: TreeNode?): List<Int> {
    fun dfs(root: TreeNode?, nodes: MutableList<Int>) {
        if (root != null) {
            dfs(root.left, nodes)

            nodes += root.`val`

            dfs(root.right, nodes)
        }
    }

    val nodes = mutableListOf<Int>()
    dfs(root, nodes)
    return nodes
}