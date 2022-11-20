/**
 * https://www.codewars.com/kata/57a429e253ba3381850000fb
 */
object CalculateBMI {
  def bmi(weight: Int, height: Double): String = {
    val bmi = weight / (height * height)
    bmi match {
      case x if x <= 18.5 => "Underweight"
      case x if x <= 25.0 => "Normal"
      case x if x <= 30.0 => "Overweight"
      case _ => "Obese"
    }
  }
}