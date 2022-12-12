package intro

val cache = hashMapOf<Int, Int>()

fun fib(n: Int): Int {
    if (cache.containsKey(n)) return cache.getValue(n)

    if (n == 0) return 0
    if (n == 1) return 1

    val operand1 = fib(n - 1)
    val operand2 = fib(n - 2)
    val result = operand1 + operand2

    cache[n] = result
    return result
}