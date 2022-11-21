/**
 * https://www.codewars.com/kata/57f780909f7e8e3183000078
 */
object ReduceButGrow {

  def grow(xs: List[Long]): Long = {
    xs.reduce(_ * _)
  }
}