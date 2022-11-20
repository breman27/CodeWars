import scala.util.Try

/**
 * https://www.codewars.com/kata/58e24788e24ddee28e000053
 */
object SimpleAssembler {
  def interpret(program: List[String]): Map[String, Int] = {
    var i = 0
    val m = scala.collection.mutable.Map[String, Int]()
    while(i < program.length) {
      val commandChunks = program(i).split(" ")
      commandChunks(0) match {
        case "mov" => {
          val isConst = Try(commandChunks(2).toInt)
          if(isConst.isSuccess) m.put(commandChunks(1), isConst.get)
          else m.put(commandChunks(1), m(commandChunks(2)))
          i += 1
        }
        case "inc" => m(commandChunks(1)) += 1; i += 1
        case "dec" => m(commandChunks(1)) -= 1; i += 1
        case "jnz" => {
          val isFirstConst = Try(commandChunks(1).toInt)
          val isSecondConst = Try(commandChunks(2).toInt)
          if(isFirstConst.isSuccess && isFirstConst.get != 0) {
            i += isSecondConst.getOrElse(m(commandChunks(2)))
          }
          else if(isFirstConst.isFailure && m(commandChunks(1)) != 0) {
            i += isSecondConst.getOrElse(m(commandChunks(2)))
          }
          else i += 1
        }
      }
    }
    m.toMap
  }
}