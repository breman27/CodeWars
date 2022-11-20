/**
 * https://www.codewars.com/kata/534ea96ebb17181947000ada
 */
object BreakingChocolate {
  def breakChocolate(n: Int, m: Int) = {
    if (n + m == 0) 0
    else n - 1 + (n * (m - 1))
  }
}