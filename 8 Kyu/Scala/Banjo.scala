object Banjo {
  def areYouPlayingBanjo(name: String): String = if(name.head.toUpper == 'R') name + " plays banjo" else name + " does not play banjo"
}