/**
 * https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce
 */
object MultiplicationTable {
  def multiTable(n: Int): String = {
    (1 to 10).map(x => s"${x} * ${n} = ${x * n}").mkString("\n")
  }
}