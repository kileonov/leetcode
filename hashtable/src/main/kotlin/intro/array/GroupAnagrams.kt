package intro.array

import java.util.LinkedList

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val wordToAnagrams = mutableMapOf<String, MutableList<String>>()

    for (str in strs) {
        val word = String(str.toCharArray().apply { sort() })
        if (!wordToAnagrams.containsKey(word)) wordToAnagrams[word] = LinkedList()
        wordToAnagrams.getValue(word).add(str)
    }

    return wordToAnagrams.values.toList()
}