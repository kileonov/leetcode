package intro

fun climbStairs(n: Int): Int {

    fun climbStairs(n: Int, memo: MutableList<Int>): Int {
        if (memo[n] > 0) return memo[n]
        if (n <= 2) return n

        val step1 = climbStairs(n - 1, memo)
        val step2 = climbStairs(n - 2, memo)

        val result = step1 + step2
        memo[n] = result
        return result
    }

    return climbStairs(n, MutableList(n + 1) { 0 })
}