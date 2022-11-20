/**
 * https://www.codewars.com/kata/52597aa56021e91c93000cb0
 */
object ZerosToEnd {
  def moveZeroes(lst: List[Int]): List[Int] = lst.filterNot(x => x == 0) ++ lst.filter(x => x == 0)
}