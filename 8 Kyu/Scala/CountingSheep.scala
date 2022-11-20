/**
 * https://www.codewars.com/kata/54edbc7200b811e956000556
 */
object CountingSheep {
  def countSheep(sheep: Array[Boolean]): Int = sheep.filter(x => x == true).size
}
