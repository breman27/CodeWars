/**
 * https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */
object CreatePhoneNumber {
  def createPhoneNumber(numbers: Seq[Int]) = {
    val last = if (numbers.length == 10) numbers(9).toString else ""
    "(" + numbers(0) + numbers(1) + numbers(2) + ") " + numbers(3) + numbers(4) + numbers(5) + "-" + numbers(6) + numbers(7) + numbers(8) + last
  }
}