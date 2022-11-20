/**
 * https://www.codewars.com/kata/53af2b8861023f1d88000832
 */
object Banjo {
  def areYouPlayingBanjo(name: String): String = if(name.head.toUpper == 'R') name + " plays banjo" else name + " does not play banjo"
}