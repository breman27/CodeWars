/**
 * https://www.codewars.com/kata/5541f58a944b85ce6d00006a
 */
object ProdFib {

  def fib(last : Long, cur: Long, num : Long, prod: Long) : Either[Long, Tuple2[Long, Long]] = {
    if ( num == 0) Left(cur)
    else if(cur * last >= prod) Right(last, cur)
    else fib(cur, last + cur, num - 1, prod)
  }

  def productFib(prod: Long): Array[Long] = {
    val fibNums = fib(1, 2, 1 - 2, prod).getOrElse(Tuple2[Long, Long](1, 1))

    if(fibNums._1 * fibNums._2 == prod) Array(fibNums._1, fibNums._2, 1)
    else Array(fibNums._1, fibNums._2, 0)
  }
}