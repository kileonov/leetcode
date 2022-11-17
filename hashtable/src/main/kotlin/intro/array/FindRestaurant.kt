package intro.array

fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {

    class Pair(val i: Int, var j: Int = -1)

    val strToSum = mutableMapOf<String, Pair>()

    list1.forEachIndexed { index, s -> strToSum[s] = Pair(index) }
    list2.forEachIndexed { index, s ->
        if (strToSum.contains(s)) {
            strToSum.getValue(s).apply { j = index }
        }
    }


    val matched = strToSum.filter { it.value.j != -1 }
    val min = with(matched.values.minBy { it.i + it.j }!!) { i + j }
    return matched.filter { it.value.i + it.value.j == min }.keys.toTypedArray()
}