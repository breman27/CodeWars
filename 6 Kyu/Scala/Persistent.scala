/**
 * https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
 */
object Persistent {
  def persistence(n: Int): Int = {
    if (n / 10 < 1) 0
    else 1 + persistence(n.toString.split("").map(_.toInt).reduce(_ * _))
  }
}