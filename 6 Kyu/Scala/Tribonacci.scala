/**
 * https://www.codewars.com/kata/556deca17c58da83c00002db
 */
object Tribonacci {
  def tribonacci[T : Numeric](signature: List[T], n: Int): List[T] = {
    trib(signature, n, n) take n
  }

  def trib[T : Numeric](signature: List[T], n: Int, original: Int): List[T] = {
    if(n == 0) List()
    else {
      if(n <= 3) signature
      else {
        trib(signature :+ signature.slice(original-n, original-n+3).sum, n - 1, original)
      }
    }
  }
}