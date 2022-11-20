/**
 * https://www.codewars.com/kata/58ca658cc0d6401f2700045f
 */
object FindMultiples {
  def findMultiples(n: Int, limit: Int): List[Int] = {
    (n to limit by n).toList
  }
}