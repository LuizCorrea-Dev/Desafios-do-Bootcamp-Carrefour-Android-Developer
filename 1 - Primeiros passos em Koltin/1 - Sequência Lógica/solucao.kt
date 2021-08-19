import kotlin.math.pow
fun main(args: Array<String>) {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach { 
      println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
      println("$it ${(it.toDouble().pow(2)).toInt() + 1} ${(it.toDouble().pow(3)).toInt() + 1}")
 