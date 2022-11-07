package intro.array

fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) return false

    var isInc = true

    for (i in 0 until arr.lastIndex) {
        when {
            arr[i] == arr[i + 1] -> return false
            arr[i] < arr[i + 1] -> if (!isInc) return false
            i == 0 -> return false
            else -> isInc = false
        }
    }

    return !isInc
}