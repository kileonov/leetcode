package intro

private val matchedParentheses = mapOf(
    '(' to ')',
    '[' to ']',
    '{' to '}'
)

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()

    for (parenthesis in s) {
        if (parenthesis in matchedParentheses.keys) {
            stack += matchedParentheses.getValue(parenthesis)
            continue
        }

        if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != parenthesis) return false
    }

    return stack.isEmpty()
}