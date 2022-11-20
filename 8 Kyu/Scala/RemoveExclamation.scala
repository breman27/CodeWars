/**
 * https://www.codewars.com/kata/57a0885cbb9944e24c00008e
 */
object RemoveExclamation {
  def removeExclamationMarks(s: String): String = s.filterNot(x => x == '!')
}