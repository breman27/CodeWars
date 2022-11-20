/**
 * https://www.codewars.com/kata/57a1fd2ce298a731b20006a4
 */
object IsPalindrome {
  def isPalindrome(s: String): Boolean = s.toLowerCase == s.reverse.toLowerCase
}