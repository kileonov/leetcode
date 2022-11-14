package intro.string

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = strs[0]

    for (i in 1..strs.lastIndex) {
        for (j in prefix.indices) {
            if (strs[i].lastIndex < j || strs[i][j] != prefix[j]) {
                prefix = prefix.substring(0, j)
                break
            }
        }
    }

    return prefix
}