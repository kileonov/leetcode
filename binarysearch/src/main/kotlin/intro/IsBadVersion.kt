package intro

private const val BAD = 14

fun firstBadVersion(n: Int) : Int {
    var l = 0
    var h = n

    while (l < h) {
        val mid = l + (h - l) / 2
        val isBad = isBadVersion(mid)
        if (isBad) h = mid else l = mid + 1
    }

    return l
}

fun isBadVersion(version: Int) : Boolean = version >= BAD