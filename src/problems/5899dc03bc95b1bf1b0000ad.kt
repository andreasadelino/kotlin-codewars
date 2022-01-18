package problems

fun invert(arr: IntArray): IntArray {
    return arr.map { -it }.toIntArray()
}

fun main() {
    println(invert(intArrayOf(1, 15, -58, 87, -74, +74)).asList())
}
