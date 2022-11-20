/**
 * https://www.codewars.com/kata/51b66044bce5799a7f000003
 */
class RomanNumeralsHelper {

  def fromRoman(roman: String): Int = {
    if(roman.length == 0) {
      0
    }
    else if(roman.length == 1) {
      roman match {
        case "I" => 1
        case "V" => 5
        case "X" => 10
        case "L" => 50
        case "C" => 100
        case "D" => 500
        case "M" => 1000
        case _ => -1
      }
    }
    else {
      roman.substring(0, 2) match {
        case "IV" => 4 + fromRoman(roman.substring(2))
        case "IX" => 9 + fromRoman(roman.substring(2))
        case "XL" => 40 + fromRoman(roman.substring(2))
        case "XC" => 90 + fromRoman(roman.substring(2))
        case "CD" => 400 + fromRoman(roman.substring(2))
        case "CM" => 900 + fromRoman(roman.substring(2))
        case _ => fromRoman(roman(0).toString) + fromRoman(roman.substring(1))
      }
    }
  }

  def toRoman(number: Int): String = {
    if(number/1000 > 0) {
      "M" * (number/1000) + toRoman(number - ((number/1000) * 1000))
    } else if(number/900 > 0) {
      "CM" * (number/900) + toRoman(number - ((number/900) * 900))
    } else if(number/500 > 0) {
      "D" * (number/500) + toRoman(number - ((number/500) * 500))
    } else if(number/400 > 0) {
      "CD" * (number/400) + toRoman(number - ((number/400) * 400))
    } else if(number/100 > 0) {
      "C" * (number/100) + toRoman(number - ((number/100) * 100))
    } else if(number/90 > 0) {
      "XC" * (number/90) + toRoman(number - ((number/90) * 90))
    } else if(number/50 > 0) {
      "L" * (number/50) + toRoman(number - ((number/50) * 50))
    } else if(number/40 > 0) {
      "XL" * (number/40) + toRoman(number - ((number/40) * 40))
    } else if(number/10 > 0) {
      "X" * (number/10) + toRoman(number - ((number/10) * 10))
    } else if(number/9 > 0) {
      "IX" * (number/9) + toRoman(number - ((number/9) * 9))
    } else if(number/5 > 0) {
      "V" * (number/5) + toRoman(number - ((number/5) * 5))
    } else if(number/4 > 0) {
      "IV" * (number/4) + toRoman(number - ((number/4) * 4))
    } else if(number/1 > 0) {
      "I" * number
    } else {
      ""
    }
  }

}