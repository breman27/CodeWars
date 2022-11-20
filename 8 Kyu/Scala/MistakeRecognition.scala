/**
 * https://www.codewars.com/kata/577bd026df78c19bca0002c0
 */
object MistakeRecognition {
  def correct(s: String): String = {
    val mistakeMap = Map(('5' -> 'S'), ('0' -> 'O'), ('1' -> 'I'))
    s.map(x => mistakeMap.getOrElse(x, x))
  }
}