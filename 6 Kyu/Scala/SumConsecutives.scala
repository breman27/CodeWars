import scala.language.postfixOps

/**
 * https://www.codewars.com/kata/55eeddff3f64c954c2000059
 */
object SumConsecutives {

  def split[T](list: List[T]): List[List[T]] = {
    list match {
      case Nil => Nil
      case head::tail => val segment = list takeWhile {head ==}
        segment :: split(list drop segment.length)
    }
  }

  def sumConsecutives(xs: List[Int]): List[Int] = {
    split(xs).map(_.sum)
  }
}