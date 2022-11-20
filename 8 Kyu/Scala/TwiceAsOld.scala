/**
 * https://www.codewars.com/kata/5b853229cfde412a470000d0
 */
object TwiceAsOld {

  def twice_as_old(dad: Int, son: Int): Int = {
    ((dad - son) * 2 - dad).abs
  }
}