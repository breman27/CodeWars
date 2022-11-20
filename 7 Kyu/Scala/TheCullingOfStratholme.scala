/**
 * https://www.codewars.com/kata/634913db7611b9003dff49ad
 */
object TheCullingOfStratholme {
  def purify(s: String): String = {
    val indexes = s.zipWithIndex.filter(x => x._1 == 'i' || x._1 == 'I').map(_._2)
    val res = s.zipWithIndex.filterNot(x => {
      x._1 != ' ' && indexes.contains(math.max(0, x._2 - 1)) ||
        x._1 != ' ' && indexes.contains(math.min(s.length, x._2 + 1)) ||
        indexes.contains(x._2)
    }).map(_._1)
    res.mkString.trim.replaceAll(" +", " ")
  }
}