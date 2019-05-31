/**
URL: https://codeforces.com/contest/1171/problem/C
*/


/**
 *@author mhashim6 on 27/05/19
 */


fun main() {
    val strings = Array(readLine()!!.toInt()) { readLine()!! }
    strings.map { string ->
        when {
            string.length == 1 -> "-1"
            palindrome(string) -> {
                if (string.all { it == string[0] }) "-1"
                else string.toCharArray().swap(0, string.indexOfFirst { it != string[0] }).joinToString("")
            }
            else -> string
        }
    }.forEach(::println)
}

fun palindrome(string: String): Boolean = string == string.reversed()

fun CharArray.swap(i: Int, j: Int) = this.apply {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}
