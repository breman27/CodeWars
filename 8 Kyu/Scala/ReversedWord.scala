/**
 * https://www.codewars.com/kata/51c8991dee245d7ddf00000e
 */
object ReversedWord {

  def reverseWords(str: String): String = {
    str.split(" ").reverse.mkString(" ")
  }
}