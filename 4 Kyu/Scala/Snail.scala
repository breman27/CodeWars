/**
 * https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1
 */
object Snail {

  def snail(xs: List[List[Int]]): List[Int] = {
    if(xs.length == 0) {
      List()
    } else if(xs.length == 1) {
      xs.head
    }else {
      xs.head ++ xs.tail.dropRight(1).map(_.last) ++ xs.last.reverse ++ xs.drop(1).dropRight(1).map(_.head).reverse ++ snail(xs.drop(1).dropRight(1).map(x => x.drop(1).dropRight(1)))
    }
  }
}