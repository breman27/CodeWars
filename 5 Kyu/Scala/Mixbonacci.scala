import scala.math.BigInt;

/**
 * https://www.codewars.com/kata/5811aef3acdf4dab5e000251
 */
object Mixbonacci {

  val fib: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: fib.zip(fib.tail).map(p => p._1 + p._2)

  val pad: LazyList[BigInt] = BigInt(1) #:: BigInt(0) #:: BigInt(0) #:: pad.zip(pad.tail).map(p => p._1 + p._2)

  val jac: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: jac.zip(jac.tail).map(p => 2*p._1 + p._2)

  val pel: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: pel.zip(pel.tail).map(p => p._1 + 2*p._2)

  val tri: LazyList[BigInt] = BigInt(0) #:: BigInt(0) #:: BigInt(1) #:: tri.zip(tri.zip(tri.tail).map(p => p._1 + p._2).tail).map(p => p._1 + p._2)

  val tet: LazyList[BigInt] = BigInt(0) #:: BigInt(0) #:: BigInt(0) #:: BigInt(1) #:: tet.zip(tet.zip(tet.zip(tet.tail).map(p => p._1 + p._2).tail).map(p => p._1 + p._2).tail).map(p => p._1 + p._2)

  def mixbonacci(pattern: List[String], length: Int): List[BigInt] = {
    // Implement me! :)
    val possible = scala.collection.mutable.Map("fib" -> -1, "pad" -> -1, "jac" -> -1, "pel" -> -1, "tri" -> -1, "tet" -> -1)
    val order = (0 until length)
      .map(i => pattern(i % pattern.length))
      .map(x => {
        possible(x) += 1
        (x, possible(x))
      })

    if(length == 0) List[BigInt]()
    else {
      val r = order.map(x => {
        x._1 match {
          case "fib" => fib(x._2)
          case "pad" => pad(x._2)
          case "jac" => jac(x._2)
          case "pel" => pel(x._2)
          case "tri" => tri(x._2)
          case "tet" => tet(x._2)
        }
      })
      r.toList: List[BigInt]
    }
  }
}