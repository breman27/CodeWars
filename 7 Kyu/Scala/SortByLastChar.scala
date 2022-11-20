/**
 * https://www.codewars.com/kata/57eba158e8ca2c8aba0002a0
 */
object SortByLastChar {
  def last(s: String): Array[String] = {
    s.split(" ").sortBy(_.takeRight(1))
  }
}