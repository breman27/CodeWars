object JadenCasing {
  implicit class StringExtensions(s: String) {
    def toJadenCase = s.split(" ").map(_.toLowerCase.capitalize).mkString(" ")
  }
}