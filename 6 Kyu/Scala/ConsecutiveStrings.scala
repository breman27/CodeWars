/**
 * https://www.codewars.com/kata/56a5d994ac971f1ac500003e
 */
object ConsecutiveStrings {
  def longestConsec(strarr: Array[String], k: Int): String = {
    if (strarr.size == 0 || k > strarr.size || k <= 0) ""
    else {
      strarr.sliding(k, 1).map(_.mkString).maxBy(_.length)
    }
  }
}