package intro.array

fun main() {
    println(isIsomorphic(s = "egg", t = "add"))
    println(isIsomorphic(s = "foo", t = "bar"))
    println(isIsomorphic(s = "paper", t = "title"))
}

    fun isIsomorphic(s: String, t: String): Boolean {
        val chToMatch = mutableMapOf<Char, Char>()
        val alreadyUsed = mutableSetOf<Char>()

        for (i in s.indices) {
            if (!chToMatch.contains(s[i])) {
                if (alreadyUsed.contains(t[i])) return false

                chToMatch[s[i]] = t[i]
                alreadyUsed += t[i]
            } else {
                if (chToMatch[s[i]] != t[i]) return false
            }
        }

        return true
    }