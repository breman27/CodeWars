object ZerosToEnd {
  def moveZeroes(lst: List[Int]): List[Int] = lst.filterNot(x => x == 0) ++ lst.filter(x => x == 0)
}