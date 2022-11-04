package intro.array

fun duplicateZeros(arr: IntArray): Unit {
    var idx = 0

    while (idx < arr.size) {
        if (arr[idx] == 0) {
            shiftElementToRight(arr, idx)
            idx++
        }
        idx++
    }
}

fun shiftElementToRight(arr: IntArray, idx: Int): Unit {
    if (idx >= arr.lastIndex) return

    for (i in arr.lastIndex downTo  idx + 1) {
        arr[i] = arr[i - 1]
    }
}