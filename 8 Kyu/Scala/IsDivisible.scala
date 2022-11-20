/**
 * https://www.codewars.com/kata/5545f109004975ea66000086
 */
object IsDivisible {
  def isDivisible(n: Int, x: Int, y: Int): Boolean = {
    n % x == 0 && n % y == 0
  }
}