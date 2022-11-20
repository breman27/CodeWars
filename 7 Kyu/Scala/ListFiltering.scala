object ListFiltering {
  def filterList(list: List[Any]): List[Int] = list.filter(_.isInstanceOf[Int]).map(_.toString.toInt)
}