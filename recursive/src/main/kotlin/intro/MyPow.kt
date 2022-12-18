package intro

import kotlin.math.abs

fun myPow(x: Double, n: Int): Double {

    fun myPowRec(x: Double, n: Int): Double {
        if (n == 0) return 1.0

        val half = myPowRec(x, n / 2)
        return if (n % 2 == 0) half * half else half * half * x
    }

   return myPowRec(if (n < 0) 1/x else x, abs(n))
}