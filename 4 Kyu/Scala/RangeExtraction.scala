/**
 * https://www.codewars.com/kata/51ba717bb08c1cd60f00002f
 */
object RangeExtraction {

  def solution(xs: List[Int]): String = {
    var flag = 0
    var newStr = ""
    if(xs.length == 1) xs(0).toString
    else {
      for(i <- (0 until xs.length-1)) {
        println(flag, xs(i), xs(i+1))
        if(xs(i) == xs(i+1)-1) {
          flag += 1
          if(flag == 2) {
            newStr += "-"
          } else if(flag == 1) {
            if(i == 0) newStr += xs(i).toString
            else newStr += "," + xs(i).toString
          }
          if(i + 1 == xs.length-1 && flag > 1) newStr += xs(i+1)
          else if(i + 1 == xs.length-1) newStr += "," + xs(i+1)
        } else {
          if(i == 0) newStr += xs(i).toString

          else if(flag > 1) {
            newStr += xs(i).toString
          }

          else newStr += "," + xs(i).toString

          if(i+1 == xs.length-1) newStr += "," + xs(i+1)
          flag = 0
        }
      }
      println(newStr)
      newStr
    }
  }
}