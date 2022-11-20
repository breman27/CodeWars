/**
 * https://www.codewars.com/kata/5592e3bd57b64d00f3000047
 */
object PileOfCubes {
  def findNb(m: Long): Int = {
    var x = 0L
    var numCubes = 1
    while (x < m) {
      x = x + math.pow(numCubes, 3).toLong
      numCubes = numCubes + 1
    }
    if (x > m) -1
    else numCubes - 1
  }
}