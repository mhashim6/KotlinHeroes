/**
URL: https://codeforces.com/contest/1170/problem/A
*/

import kotlin.math.max
import kotlin.math.min

/**
 *@author mhashim6 on 27/05/19
 */


fun main() {
    val pairs = Array(readLn().toInt()) {
        readLn().split(" ").map(String::toInt).run { this[0] to this[1] }
    }

    pairs.map { (`a+b`, `a+c`) ->
        minMax(`a+b`, `a+c`) { min, max ->
            Triple(1, min - 1, max - (min - 1))
        }
    }.forEach { println("${it.first} ${it.second} ${it.third}") }

}

fun readLn() = readLine()!!

inline fun <T> minMax(x: Int, y: Int, action: (min: Int, max: Int) -> T): T = action(min(x, y), max(x, y))
