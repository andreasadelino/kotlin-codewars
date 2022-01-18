package problems

fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    var tribonacci = signature.toMutableList()
    if (n == 0) {
        return doubleArrayOf()
    }
    if (n <= 3) {
        return signature.asList().take(n).toDoubleArray()
    }
    for (i in 3 until n) {
        val nextSeq = tribonacci.slice(i - 3 until i).reduce { acc, d -> acc + d }
        tribonacci.add(nextSeq)
    }
    return tribonacci.toDoubleArray()
}

fun main() {
    println(tribonacci(doubleArrayOf(0.0, 0.0, 1.0), 21).asList())
}
