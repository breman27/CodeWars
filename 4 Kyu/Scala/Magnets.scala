/**
 * https://www.codewars.com/kata/56c04261c3fcf33f2d000534
 */
object Magnets {

  def doubles(maxk: Int, maxn: Int): Double = {
    var total: Double = 0
    for(k <- (1 to maxk)) {
      var innerTotal: Double = 0
      for(n <- (1 to maxn)) {
        innerTotal += 1 / (k * Math.pow((n+1), 2*k))
      }
      total += innerTotal
    }
    total
  }
}