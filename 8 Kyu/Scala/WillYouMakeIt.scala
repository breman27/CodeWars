/**
 * https://www.codewars.com/kata/5861d28f124b35723e00005e
 */
object WillYouMakeIt {
  def zeroFuel(distance: Int, mpg: Int, fuel: Int): Boolean = (mpg * fuel) - distance >= 0
}