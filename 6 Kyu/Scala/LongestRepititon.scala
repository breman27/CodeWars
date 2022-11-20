import scala.language.postfixOps

/**
 * https://www.codewars.com/kata/586d6cefbcc21eed7a001155
 */
object LongestRepititon {
  def split[T](list: List[T]): List[List[T]] = {
    list match {
      case Nil => Nil
      case head :: tail => val segment = list takeWhile {
        head ==
      }
        segment :: split(list drop segment.length)
    }
  }

  def longestRepetition(s: String): (String, Int) = {
    // Implement me! :)
    val xs = split(s.toList)
    if (xs.isEmpty) ("", 0)
    else xs.map(x => x(0).toString -> x.length).maxBy(_._2)
  }
}