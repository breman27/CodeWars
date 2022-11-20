/**
 * https://www.codewars.com/kata/5839edaa6754d6fec10000a2
 */
object MissingLetter {
  def findMissingLetter(chars: Array[Char]): Char = {
    ((chars.head to chars.last) diff chars) (0)
  }
}