package problems

import kotlin.test.assertEquals

fun makeComplement(dna: String): String {
    val dnaMap: Map<String, String> = mapOf(
        "A" to "T",
        "T" to "A",
        "C" to "G",
        "G" to "C"
    )

    return dna.fold("") { acc, c -> acc + dnaMap.getValue(c.toString()) }
//    return dna.map { p -> dnaMap.getValue(p.toString()) }.joinToString("")
}

// best solution
//fun makeComplement(dna: String) = dna.map { when(it) {
//    'A' -> 'T'
//    'T' -> 'A'
//    'C' -> 'G'
//    'G' -> 'C'
//    else -> it
//} }.joinToString("")

fun main() {
    assertEquals("TTTT", makeComplement("AAAA"));
    assertEquals("TAACG", makeComplement("ATTGC"));
}
