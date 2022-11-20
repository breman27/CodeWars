object LeapYears {
  object Solution {
    def isLeap(year: Int): Boolean = year % 400 == 0 || year % 4 == 0 && year % 100 != 0
  }
}