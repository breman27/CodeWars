/**
 * https://www.codewars.com/kata/57eae20f5500ad98e50002c5
 */
object NoSpaces {

  def noSpace(s: String): String = {
    s.replaceAll(" ", "")
  }
}