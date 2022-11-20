/**
 * https://www.codewars.com/kata/56f699cd9400f5b7d8000b55
 */
object WrongEnd {

  def fixTheMeerkat(arr: List[String]): List[String] = {
    arr.last +: arr.drop(1).dropRight(1) :+ arr.head
  }
}