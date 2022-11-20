/**
 * https://www.codewars.com/kata/5bb904724c47249b10000131
 */
object TotalPoints {
  def points(games: Vector[String]): Int = {
    games.map(score => score.split(":").toList).map(x => {
      if(x(0) > x(1)) 3
      else if(x(0) < x(1)) 0
      else 1
    }).sum
  }
}