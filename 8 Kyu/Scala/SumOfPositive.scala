/**
 * https://www.codewars.com/kata/5715eaedb436cf5606000381
 */
object SumOfPositive {
  def positiveSum(arr: Array[Int]): Int = {
    arr.filter(_ > 0).sum
  }
}