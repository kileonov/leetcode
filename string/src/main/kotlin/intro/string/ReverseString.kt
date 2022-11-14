package intro.string

fun reverseString(s: CharArray): Unit {
    if (s.isEmpty()) return

    var startIdx = 0
    var endIdx = s.lastIndex

    while (startIdx < endIdx) {
        val temp = s[startIdx]
        s[startIdx] = s[endIdx]
        s[endIdx] = temp

        startIdx++
        endIdx--
    }
}