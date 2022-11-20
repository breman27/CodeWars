/**
 * https://www.codewars.com/kata/55908aad6620c066bc00002a
 */
object ExesAndOhs {

  def xo(str: String): Boolean = {
    val cleanStr = str.toLowerCase
    cleanStr.count(_ == 'x') == cleanStr.count(_ == 'o')
  }
}