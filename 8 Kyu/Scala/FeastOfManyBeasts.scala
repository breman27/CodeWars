/**
 * https://www.codewars.com/kata/5aa736a455f906981800360d
 */
object FeastOfManyBeasts {
  def feast(beast: String, dish: String): Boolean = {
    beast.head == dish.head && beast.last == dish.last
  }
}