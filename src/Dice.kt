/**
URL: https://codeforces.com/contest/1171/problem/A
*/

/**
 *@author mhashim6 on 27/05/19
 */

val dice: Array<Int> = Array(6) { it + 2 }

fun main() {
    val count = readLine()!!.toInt()
    val sums = Array(count) { readLine()!!.toInt() }

    sums.map { sum ->
        dice.filter { sum % it == 0 }.max()?.let {
            return@map sum / it
        }

        dice.reversedArray().forEach { face ->
            dice.filter { (sum - face) % it == 0 }.max()?.let {
                return@map ((sum - face) / it) + 1
            }
        }

    }.forEach(::println)
}
