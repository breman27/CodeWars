/**
 * https://www.codewars.com/kata/5bb0c58f484fcd170700063d
 */
object Pillars {
  def distance(num_pill: Int, dist: Int, width: Int ): Int = {
    if(num_pill == 1) 0
    else (num_pill-1) * dist * 100 + ((num_pill - 2) * width)
  }
}