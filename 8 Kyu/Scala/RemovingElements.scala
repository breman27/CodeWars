/**
 * https://www.codewars.com/kata/5769b3802ae6f8e4890009d2
 */
object RemovingElements {

  def removeEveryOther[T](list: List[T]): List[T] = {
    list.sliding(1, 2).toList.flatten
  }
}