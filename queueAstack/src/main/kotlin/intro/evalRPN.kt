package intro

private val OPERATOR_TO_FUN = mapOf<String, (Int, Int) -> Int>(
    "+" to { num1, num2 -> num1 + num2 },
    "-" to { num1, num2 -> num1 - num2 },
    "*" to { num1, num2 -> num1 * num2 },
    "/" to { num1, num2 -> num1 / num2 }
)

fun evalRPN(tokens: Array<String>): Int {
    val operands = mutableListOf<Int>()
    for (token in tokens) {
        if (token in OPERATOR_TO_FUN) {
            val operand1 = operands.removeAt(operands.lastIndex)
            val operand2 = operands.removeAt(operands.lastIndex)

            operands += OPERATOR_TO_FUN.getValue(token)(operand2, operand1)
            continue
        }

        operands += token.toInt()
    }

    return operands.first()
}