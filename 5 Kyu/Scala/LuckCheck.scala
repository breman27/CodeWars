object LuckCheck {
  def luckCheck(s: String): Boolean = {
    if (s.filter(_.isDigit).size != s.length) throw new NumberFormatException
    if (s.length % 2 == 1) {
      s.substring(0, s.length / 2).map(_.asDigit).sum == s.substring(s.length / 2 + 1, s.length).map(_.asDigit).sum
    }
    else {
      s.substring(0, s.length / 2).map(_.asDigit).sum == s.substring(s.length / 2, s.length).map(_.asDigit).sum
    }
  }
}