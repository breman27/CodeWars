/**
 * https://www.codewars.com/kata/5ce399e0047a45001c853c2b
 */
object SumOfParts {

  def partsSums(l: List[Int]): List[Int] = {
    var s = l.sum
    if(l.length == 0) List(0)
    else {
      List(s) ++ l.map(x => {
        s -= x
        s
      })
    }
  }
}