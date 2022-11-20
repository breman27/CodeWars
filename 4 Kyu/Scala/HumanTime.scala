/**
 * https://www.codewars.com/kata/52742f58faf5485cae000b9a
 */
object HumanTime {

  private val YEAR = 31536000
  private val DAY = 86400
  private val HOUR = 3600
  private val MINUTE = 60
  private val SECOND = 1

  def calcDuration(seconds: Int, period: String, periodAmount: Int): String = {
    val num = (seconds / periodAmount)
    if(num > 1) num.toString + " " + period + "s"
    else num.toString + " " + period
  }

  def formatDuration(seconds: Int): String = {

    def loop(seconds: Int): String = {
      seconds match {
        case a if(a >= YEAR) => calcDuration(a, "year", YEAR) + "/" + loop(a % YEAR)
        case b if(b >= DAY) => calcDuration(b, "day", DAY) + "/" + loop(b % DAY)
        case c if(c >= HOUR) => calcDuration(c, "hour", HOUR) + "/" + loop(c % HOUR)
        case d if(d >= MINUTE) => calcDuration(d, "minute", MINUTE) + "/" + loop(d % MINUTE)
        case e if(e >= SECOND) => calcDuration(e, "second", SECOND)
        case 0 => "now"
      }
    }
    val l = loop(seconds)

    val axioms = if(l.split("/").length > 1 && l.split("/").last == "now") l.split("/").dropRight(1) else l.split("/")

    if(axioms.length == 1) axioms.mkString
    else axioms.dropRight(1).toList.mkString("", ", ", " and ") + axioms.last
  }

}