/**
 * https://www.codewars.com/kata/58649884a1659ed6cb000072
 */
object TrafficLight {
  def updateLight(current: String): String = {
    current match {
      case "green" => "yellow"
      case "yellow" => "red"
      case "red" => "green"
    }
  }
}