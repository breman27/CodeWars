/**
 * https://www.codewars.com/kata/555eded1ad94b00403000071
 */
object SumOfNthTerms {
  def seriesSum(n: Int): String = {
    "%1.2f".format((for (i <- (1 to n * 3) by 3) yield 1.0 / i).sum)
  }
}