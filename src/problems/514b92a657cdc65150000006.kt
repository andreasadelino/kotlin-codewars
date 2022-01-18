package problems

import kotlin.test.assertEquals

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
*/
fun solution(number: Int): Int {
    val intProgression = 3 until number step 3
    var sum = 0;
    if (number < 3) {
        return 0;
    }
    val range: IntRange = 3 until number;
    for (num in range) {
        if (num % 3 == 0 || num % 5 == 0) {
            sum += num
        }
    }
    return sum;
}

// best solution

//fun solution(number: Int) = (3 until number step 3)
//    .union(5 until number step 5)
//    .sum()

fun main() {
    assertEquals(23, solution(10))
    assertEquals(78, solution(20))
    assertEquals(9168, solution(200))

    println(solution(201))
    println(solution(202))
    println(solution(205))
    println(solution(206))
}
