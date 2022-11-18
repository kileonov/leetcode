package intro

class MyCircularQueue(k: Int) {

    private val data: MutableList<Int> = MutableList(k) { -1 }
    private val capacity: Int = k
    private var size: Int = 0
    private var head = 0
    // formula: (tail + size - 1) % capacity
    private var tail = 0

    fun enQueue(value: Int): Boolean {
        if (isFull()) return false

        data[tail] = value
        tail = (tail + 1) % capacity
        size++

        return true
    }

    fun deQueue(): Boolean {
        if (isEmpty()) return false

        head = (head + 1) % capacity
        size--

        return true
    }

    fun Front(): Int {
        return if (!isEmpty()) data[head] else -1
    }

    fun Rear(): Int {
        return if (!isEmpty()) data[(tail - 1 + capacity) % capacity] else -1
    }

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun isFull(): Boolean {
        return size == capacity
    }
}
