/**
 * https://www.codewars.com/kata/57ee4a67108d3fd9eb0000e7
 */
object FilterGeese {
  val geese = Array("African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher")

  def gooseFilter(birds: List[String]): List[String] = birds.diff(geese)
}