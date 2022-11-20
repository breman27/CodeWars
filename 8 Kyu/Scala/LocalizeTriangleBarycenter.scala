/**
 * https://www.codewars.com/kata/5601c5f6ba804403c7000004
 */
object LocalizeTriangleBarycenter {
  def barTriang(pointA: (Int, Int), pointB: (Int, Int), pointC: (Int, Int)): (Double, Double) = {
    (((pointA._1 + pointB._1 + pointC._1) / 3.0 * 10000).round / 10000.0, ((pointA._2 + pointB._2 + pointC._2) / 3.0 * 10000).round / 10000.0)
  }
}