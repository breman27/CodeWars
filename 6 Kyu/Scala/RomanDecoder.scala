/**
 * https://www.codewars.com/kata/51b6249c4612257ac0000005
 */
object RomanDecoder {
  def resolveValue(c: String): Int = {
    c match {
      case "I" => 1
      case "V" => 5
      case "X" => 10
      case "L" => 50
      case "C" => 100
      case "D" => 500
      case "M" => 1000
    }
  }

  def decode(roman: String): Int = {
    if (roman.length == 1) resolveValue(roman)
    else {
      var res = resolveValue(roman.reverse.head.toString)
      roman.reverse.toSeq.sliding(2, 1).map(_.unwrap).map(x => x.split("").toList match {
        case x :: y :: Nil =>
          if (resolveValue(x) <= resolveValue(y)) {
            res += resolveValue(y)
          } else {
            res -= resolveValue(y)
          }
        case x :: Nil => resolveValue(x)
      }).toList
      res
    }
  }
}