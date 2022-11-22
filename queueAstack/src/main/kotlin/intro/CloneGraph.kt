package intro

private class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
    override fun toString(): String {
        return "Node(`val`=$`val`)"
    }
}

private fun cloneGraph(node: Node?): Node? {

    fun dfs(node: Node?, visited: MutableMap<Node, Node>): Node? {
        if (node == null) return null

        if (visited.containsKey(node)) return visited.getValue(node)

        val copy = Node(node.`val`)
        visited[node] = copy

        for (neighbor in node.neighbors) {
            copy.neighbors.add(dfs(neighbor, visited))
        }

        return copy
    }

    return node?.let { dfs(it, hashMapOf()) }
}
