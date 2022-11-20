/**
 * https://www.codewars.com/kata/53dbd5315a3c69eed20002dd
 */
object ListFiltering {
  def filterList(list: List[Any]): List[Int] = list.filter(_.isInstanceOf[Int]).map(_.toString.toInt)
}