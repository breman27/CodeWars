/**
 * https://www.codewars.com/kata/5648b12ce68d9daa6b000099
 */
object Bus {
  def number(busStops: List[(Int, Int)]): Int = {
    val finalStop = busStops.reduce((x, y) => (x._1 + y._1, x._2 + y._2))
    finalStop._1 - finalStop._2
  }
}