/**
 * https://www.codewars.com/kata/5390bac347d09b7da40006f6
 */
object JadenCasing {
  implicit class StringExtensions(s: String) {
    def toJadenCase = s.split(" ").map(_.toLowerCase.capitalize).mkString(" ")
  }
}