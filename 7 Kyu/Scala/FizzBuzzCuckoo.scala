/**
 * https://www.codewars.com/kata/58485a43d750d23bad0000e6
 */
object FizzBuzzCuckoo {
  def fizzBuzzCuckooClock(time: String): String = {
    val timeSplit = time.split(":")
    timeSplit(0).toInt match {
      case 0 | 12 => if (timeSplit(1).toInt == 0) ("Cuckoo " * 12).trim else minuteFizzBuzz(timeSplit(1).toInt)
      case n => if (timeSplit(1).toInt == 0) ("Cuckoo " * (n % 12)).trim else minuteFizzBuzz(timeSplit(1).toInt)
    }
  }

  def minuteFizzBuzz(minute: Int): String = {
    minute match {
      case 30 => "Cuckoo"
      case x if x % 15 == 0 => "Fizz Buzz"
      case x if x % 3 == 0 => "Fizz"
      case x if x % 5 == 0 => "Buzz"
      case _ => "tick"
    }
  }
}