/**
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 */
object FindTheOddInt {
  def findOdd(xs: Seq[Int]): Int = {
    xs.reduce((total, curr) => total ^ curr)
  }
}