import scala.collection.mutable.Stack

/**
 * https://www.codewars.com/kata/550f22f4d758534c1100025a
 */

object DirReduction {

  def dirReduc(arr: Array[String]): Array[String] = {
    var stack = Stack[String]()
    arr.foreach(s => {
      if(stack.size == 0) stack.push(s)
      else {
        stack.top.toLowerCase match {
          case "north" => if(s.equalsIgnoreCase("south")) stack.pop else stack.push(s)
          case "south" => if(s.equalsIgnoreCase("north")) stack.pop else stack.push(s)
          case "west" => if(s.equalsIgnoreCase("east")) stack.pop else stack.push(s)
          case "east" => if(s.equalsIgnoreCase("west")) stack.pop else stack.push(s)
        }
      }
    })
    stack.toArray.reverse
  }
}