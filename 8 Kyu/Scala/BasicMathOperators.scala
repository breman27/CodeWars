/**
 * https://www.codewars.com/kata/57356c55867b9b7a60000bd7
 */
object BasicMathOperators {
  def basicOp(op: Char, a: Int, b: Int): Int = op match {
    case '+' => a + b
    case '-' => a - b
    case '*' => a * b
    case '/' => a / b
  }
}