/**
 * https://www.codewars.com/kata/566fc12495810954b1000030
 */
object CountDigit {
  def nbDig(n: Int, d: Int): Int = {
    (0 to n).map(x => x * x).map(_.toString.count(_ == (d + 48))).sum
  }
}