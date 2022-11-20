/**
 * https://www.codewars.com/kata/563b662a59afc2b5120000c6
 */
object PopulationGrowth {
  def nbYear(p0: Int, percent: Double, aug: Int, p: Int): Int = {
    var currPop = p0
    var i = 0
    while (currPop < p) {
      println(currPop * percent)
      currPop = currPop + (currPop * (percent / 100)).toInt + aug
      i = i + 1
    }
    i
  }
}