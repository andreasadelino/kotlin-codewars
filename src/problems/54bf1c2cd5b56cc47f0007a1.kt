package problems

import kotlin.test.assertEquals

/**
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */
fun duplicateCount(text: String): Int {
    var repeatedChars = "";

    val toLower = text.lowercase()

    toLower
        .forEach { c ->
            run {
                if (toLower.indexOf(c) != toLower.lastIndexOf(c) && !repeatedChars.contains(c)) {
                    repeatedChars += c
                }
            }
        }

    return repeatedChars.length;

}

// best solution
// fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }

fun main() {
    println(duplicateCount("aaaaabbcccdefffghii"))
    println(duplicateCount("abcdeaB"))

//    val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
//    println(duplicateCount(text))
}
