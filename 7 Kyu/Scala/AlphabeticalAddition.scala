/**
 * https://www.codewars.com/kata/5d50e3914861a500121e1958
 */
object AlphabeticalAddition {
  def addLetters(letters: List[Char]): Char = {
    if (letters.isEmpty) 'z'
    else {
      letters.map(_.toInt - 96).sum match {
        case x if x % 26 == 0 => 'z'
        case x => (x % 26 + 96).toChar
      }
    }
  }
}