import scala.util.{Try, Success, Failure}

object SuperDuperEasy {
  def problem(a: String): String = {
    val res = Try(a.toInt)
    res match {
      case Success(x) => (x * 50 + 6).toString
      case Failure(x) => "Error"
    }
  }
}