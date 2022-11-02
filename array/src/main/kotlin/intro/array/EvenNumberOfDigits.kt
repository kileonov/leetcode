package intro.array

fun findNumbers(nums: IntArray): Int {
    var counter = 0

    nums.forEach {

        var currentNum = it
        var currentDigitCounter = 0
        while (currentNum > 0) {
            currentNum /= 10
            currentDigitCounter++
        }

        if (currentDigitCounter % 2 == 0) {
            counter++
        }
    }

    return counter
}