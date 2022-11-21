/**
 * https://www.codewars.com/kata/515e271a311df0350d00000f
 */
object SquareSum {

  def squareSum(xs: List[Int]): Int = {
    xs.map(x => x * x).sum
  }
}