/**
 * https://www.codewars.com/kata/558fc85d8fd1938afb000014
 */
object SumOfSmallestInts {
  def sumTwoSmallest(numbers: List[Int]): Int = {
    numbers.min + (numbers diff List(numbers.min)).min
  }
}