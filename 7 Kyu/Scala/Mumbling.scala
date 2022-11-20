object Mumbling {
  def accum(s: String) = {
    s.toList.zipWithIndex.map(x => (x._1.toString * (x._2 + 1)).toLowerCase.capitalize).mkString("-")
  }
}