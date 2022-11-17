package intro.array

private val msgToTs = mutableMapOf<String, Int>()

fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
    return if (msgToTs[message]?.let { timestamp - it >= 10 } != false) {
        msgToTs[message] = timestamp
        true
    } else {
        false
    }
}