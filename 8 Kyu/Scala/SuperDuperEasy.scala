import scala.util.{Try, Success, Failure}

/**
 * https://www.codewars.com/kata/55a5bfaa756cfede78000026
 */
object SuperDuperEasy {
  def problem(a: String): String = {
    val res = Try(a.toInt)
    res match {
      case Success(x) => (x * 50 + 6).toString
      case Failure(x) => "Error"
    }
  }
}