/**
 * https://www.codewars.com/kata/55f2b110f61eb01779000053
 */
object SumOfThreeNums {
  def getSum(a: Int, b: Int): Int = {
    (math.min(a, b) to math.max(a, b)).sum
  }
}