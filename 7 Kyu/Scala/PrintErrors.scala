/**
 * https://www.codewars.com/kata/56541980fa08ab47a0000040
 */
object PrintErrors {
  def printerError(s: String): String = {
    val (in, out) = s.toCharArray.partition(c => ('a' to 'm').contains(c))
    out.size + "/" + (in.size + out.size)
  }
}