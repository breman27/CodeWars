/**
 * https://www.codewars.com/kata/5808dcb8f0ed42ae34000031
 */
object SwitchItUp {
  val nums = Map((0 -> "Zero"), (1 -> "One"), (2 -> "Two"), (3 -> "Three"), (4 -> "Four"),
    (5 -> "Five"), (6 -> "Six"), (7 -> "Seven"), (8 -> "Eight"), (9 -> "Nine"))

  def switchItUp(number: Int): String = nums(number)
}