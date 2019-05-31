/**
URL: https://codeforces.com/contest/1171/problem/F
*/

/**
 *@author mhashim6 on 27/05/19
 */


fun main() {
    val count = readLine()!!.toInt()
    val queries = Array(count) {
        Array(readLine()!!.toInt()) {
            val segment = readLine()!!.split(" ").map(String::toInt)
            Segment(segment[0], segment[1])
        }
    }

    queries.forEach { query ->
        for (i in 0 until query.size - 1) {
            query[i].group = 1
            query[i + 1].group = if (query[i].intersects(query[i + 1])) query[i].group else 3 - query[i].group
        }
        if (query.all { it.group == query[0].group }) {
            println("-1");
        } else println(query.map { it.group }.joinToString(" "))
    }
}

class Segment(val i: Int, val r: Int, var group: Int = -1)

fun Segment.intersects(another: Segment) = i == another.i || r == another.r
