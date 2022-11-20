/**
 * https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
 */
object InvertValues {
  def invert(lst: List[Int]): List[Int] = {
    lst.map(_ * -1)
  }
}