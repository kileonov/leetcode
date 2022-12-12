package intro

fun reverseString(s: CharArray): Unit {
    fun reverseStringRec(s: CharArray, l: Int, r: Int) {
        if (l >= r) return

        val temp = s[l]
        s[l] = s[r]
        s[r] = temp

        reverseStringRec(s, l + 1, r - 1)
    }

    reverseStringRec(s, 0, s.lastIndex)
}