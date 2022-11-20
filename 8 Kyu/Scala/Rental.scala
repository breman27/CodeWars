/**
 * https://www.codewars.com/kata/568d0dd208ee69389d000016
 */
object Rental {

  def cost(days: Int): Int = {
    if(days >= 7) days * 40 - 50
    else if(days >= 3) days * 40 - 20
    else days * 40
  }
}