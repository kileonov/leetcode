package intro.array

fun checkIfExist(arr: IntArray): Boolean {
    for (i in 0 until arr.lastIndex) {
        for (j in (i + 1)..arr.lastIndex) {

            if (arr[i] * 2 == arr[j] || arr[j] * 2 == arr[i]) {
                return true
            }
        }
    }

    return false
}