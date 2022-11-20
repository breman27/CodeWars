/**
 * https://www.codewars.com/kata/56a4872cbb65f3a610000026
 */
object RotateForMax {
  def rotateLeft[A](seq: Seq[A], i: Int = 1): Seq[A] = {
    val size = seq.size
    seq.drop(i) ++ seq.take(i)
  }

  def maxRot(n: Long): Long = {
    var digits = n.toString.split("").toSeq
    ((0 to digits.length).map(x => {
      digits = (digits.take(x) ++ rotateLeft(digits.takeRight(digits.length - x)))
      digits.mkString.toLong
    }) :+ n).max
  }
}