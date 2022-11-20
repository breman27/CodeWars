/**
 * https://www.codewars.com/kata/5663f5305102699bad000056
 */
object MaxLengthDifference {
  def mxdiflg(a1: List[String], a2: List[String]): Int = {
    if (a1.length == 0 || a2.length == 0) -1
    else {
      val a1Max = a1.maxBy(_.size)
      val a1Min = a1.minBy(_.size)
      val a2Max = a2.maxBy(_.size)
      val a2Min = a2.minBy(_.size)
      math.max(math.max(math.abs(a1Max.length - a2Min.length), math.abs(a2Max.length - a1Min.length)), math.max(math.abs(a1Min.length - a2Max.length), math.abs(a2Min.length - a1Max.length)))
    }
  }
}