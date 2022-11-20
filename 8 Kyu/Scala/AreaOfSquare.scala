/**
 * https://www.codewars.com/kata/5748838ce2fab90b86001b1a
 */
object AreaOfSquare {
  def squareArea(arc: Double): Double = {
    val r = 4 * arc / (2 * scala.math.Pi)
    Math.round(r * r * 100) / 100.0
  }
}