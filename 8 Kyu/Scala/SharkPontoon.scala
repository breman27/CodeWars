/**
 * https://www.codewars.com/kata/57e921d8b36340f1fd000059
 */
object SharkPontoon {
  def shark(youDistance: Double, sharkDistance: Double, youSpeed: Double, sharkSpeed: Double, dolphin: Boolean): String = {
    val survive = if (dolphin) {
      sharkDistance / (sharkSpeed / 2) >= youDistance / youSpeed
    } else {
      sharkDistance / sharkSpeed >= youDistance / youSpeed
    }
    if (survive) "Alive!" else "Shark Bait!"
  }
}