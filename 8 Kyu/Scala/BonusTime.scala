object BonusTime {
  def bonusTime(salary: Int, bonus: Boolean): String = {
    val takeHome = if (bonus) "£" + salary * 10 else "£" + salary
    takeHome
  }
}