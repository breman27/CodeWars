/**
 * https://www.codewars.com/kata/5ae62fcf252e66d44d00008e
 */
object ExpressionsMatter {
  def expressionMatter(a: Int, b: Int, c: Int): Int = {
    val leftSide = Math.max(a + b, a * b)
    val rightSide = Math.max(b + c, b * c)
    Math.max(Math.max(leftSide + c, leftSide * c), Math.max(a + rightSide, a * rightSide))
  }
}