/**
 * https://www.codewars.com/kata/5583090cbe83f4fd8c000051
 */
object NumberToReverseArray {
  def digitize(n: Long): Seq[Int] = n.toString.reverse.map(_.asDigit)
}