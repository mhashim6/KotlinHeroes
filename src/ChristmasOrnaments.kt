/**
URL: https://codeforces.com/contest/1171/problem/B
*/

/**
 *@author mhashim6 on 27/05/19
 */


fun main() {
    var y = 0;
    var b = 0;
    var r = 0;
    with(readLine()!!.split(" ")) {
        y = this[0].toInt(); b = this[1].toInt(); r = this[2].toInt()
    }
    while (y + 1 > b || y + 2 > r) y--
    println(3 * y + 3)
}
