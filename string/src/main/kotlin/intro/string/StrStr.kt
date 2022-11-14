package intro.string

fun strStr(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1

    for (i in haystack.indices) {
        if (isSubStr(haystack, i, needle)) return i
    }

    return -1
}

fun isSubStr(haystack: String, i: Int, needle: String): Boolean {
    var idxHaystack = i
    for (idxNeedle in needle.indices) {
        if (idxHaystack !in haystack.indices || haystack[idxHaystack++] != needle[idxNeedle]) return false
    }

    return true
}
