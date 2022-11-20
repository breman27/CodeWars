/**
 * https://www.codewars.com/kata/56f6ad906b88de513f000d96
 */
object BonusTime {
  def bonusTime(salary: Int, bonus: Boolean): String = {
    val takeHome = if (bonus) "£" + salary * 10 else "£" + salary
    takeHome
  }
}