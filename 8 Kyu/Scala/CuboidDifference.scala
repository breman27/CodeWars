/**
 * https://www.codewars.com/kata/58cb43f4256836ed95000f97
 */
object CuboidDifference {
  def findDifference(a: (Int, Int, Int), b: (Int, Int, Int)): Int = (a.toList.product - b.toList.product).abs
}