/**
 * https://www.codewars.com/kata/555086d53eac039a2a000083
 */
object OppositesAttract {
  def lovefunc(flower1: Int, flower2: Int): Boolean = {
    (flower1 + flower2) % 2 == 1
  }
}