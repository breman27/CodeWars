/**
 * https://www.codewars.com/kata/54eb33e5bc1a25440d000891
 */
object SquareIntoSquares {
  def getSquares(square: Double, next: Long, acc: List[Long] = List()): List[Long] = {
    val nextSquare = square - next * next
    val remains = math.sqrt(nextSquare).toLong

    val updatedList = (nextSquare match {
      case 0 => next +: acc
      case nextSquare if remains >= next => List()
      case nextSquare => getSquares(nextSquare, remains, next +: acc)
    })

    updatedList match {
      case List() if next > 1 => getSquares(square, next - 1, acc)
      case result => result
    }
  }

  def decompose(n: Long): String = {
    val res = getSquares(n * n, n - 1)
    if (res.size != 0) res.mkString(" ")
    else null
  }
}