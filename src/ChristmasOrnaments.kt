/**
URL: https://codeforces.com/contest/1171/problem/B
 */

/**
 *@author mhashim6 on 27/05/19
 */


fun main() {
    var (y, b, r) = readLine()!!.split(" ").map(String::toInt).toTriple()
    while (y + 1 > b || y + 2 > r) y--
    println(3 * y + 3)
}

fun <T> List<T>.toTriple(i: Int = 0, j: Int = 1, k: Int = 2) = Triple(this[i], this[j], this[k])