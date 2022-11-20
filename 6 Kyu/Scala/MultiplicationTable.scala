/**
 * https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08
 */
object MultiplicationTable {
  def multiplicationTable(size: Int): List[List[Int]] = {
    (1 to size).map(x => (1 to size).map(y => x * y).toList).toList
  }
}