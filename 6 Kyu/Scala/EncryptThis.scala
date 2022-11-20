/**
 * https://www.codewars.com/kata/5848565e273af816fb000449
 */
object EncryptThis {
  def encryptThis(text: String): String = {
    if (text.isEmpty) ""
    else {
      text.split(" ").map(x => {
        val tailHead = if (x.tail.length > 1) x.tail.head else ""
        val tailLast = if (x.tail.length > 0) x.tail.last else ""
        s"${x.head.toInt}${tailLast}${x.tail.tail.dropRight(1)}${tailHead}"
      }).mkString(" ")
    }
  }
}