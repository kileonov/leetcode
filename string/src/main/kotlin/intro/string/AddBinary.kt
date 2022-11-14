package intro.string

fun main() {
    println(addBinary("11", "1"))
    println(addBinary("1010", "1011"))
}

fun addBinary(a: String, b: String): String {
    if (a.length < b.length) return addBinary(b, a)

    val result = StringBuilder()
    var idxB = b.lastIndex
    var acc = 0
    for (i in a.indices.reversed()) {
        if (a[i] == '1') acc++
        if (idxB in b.indices && b[idxB--] == '1') acc++

        result.append(if (acc % 2 == 1) '1' else '0')

        acc /= 2
    }

    if (acc == 1) {
        result.append(1)
    }

    return result.reverse().toString()
}