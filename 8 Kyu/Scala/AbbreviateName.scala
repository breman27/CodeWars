/**
 * https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
 */
object AbbreviateName {
  def abbrevName(name: String): String = name.split(" ").map(_.toUpperCase.head).mkString(".")
}