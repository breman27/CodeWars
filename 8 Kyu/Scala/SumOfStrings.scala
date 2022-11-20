import scala.util.Try

/**
 * https://www.codewars.com/kata/5966e33c4e686b508700002d
 */

object SumOfStrings {
  def stringSum(a: String, b: String): String = {
    val c = Try(a.toInt).getOrElse(0)
    val d = Try(b.toInt).getOrElse(0)
    (c + d).toString
  }
}