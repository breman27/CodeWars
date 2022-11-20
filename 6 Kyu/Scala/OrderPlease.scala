/**
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f
 */
object OrderPlease {
  def order(str: String): String = {
    if (str.isEmpty) str
    else {
      val arr = new Array[String](str.split(" ").length)
      val words = str.split(" ")
      val pattern = "[1-9]".r
      var i = 0
      pattern.findAllIn(str).matchData foreach {
        m =>
          arr(m.toString.toInt - 1) = (words(i))
          i = i + 1
      }
      arr.mkString(" ")
    }
  }
}