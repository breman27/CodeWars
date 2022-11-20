
/**
 * https://www.codewars.com/kata/526c7363236867513f0005ca
 */
object LeapYears {
  object Solution {
    def isLeap(year: Int): Boolean = year % 400 == 0 || year % 4 == 0 && year % 100 != 0
  }
}