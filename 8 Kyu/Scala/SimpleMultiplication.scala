/**
 * https://www.codewars.com/kata/583710ccaa6717322c000105
 */
object SimpleMultiplication {

  def multiply(n: Int): Int = {
    if(n % 2 == 0) n * 8
    else n * 9
  }
}