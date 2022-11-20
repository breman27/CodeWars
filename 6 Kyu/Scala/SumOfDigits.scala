import scala.annotation.tailrec

/**
 * https://www.codewars.com/kata/541c8630095125aba6000c00
 */
object SumOfDigits {

  @tailrec
  def digitalRoot(n: Int): Int = {
    val digits = n.toString.map(_.asDigit).toList
    if(digits.length > 1) {
      digitalRoot(digits.map(_.toInt).sum)
    }
    else {
      digits.sum
    }
  }
}