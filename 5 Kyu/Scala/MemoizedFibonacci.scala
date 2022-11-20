/**
 * https://www.codewars.com/kata/529adbf7533b761c560004e5
 */
object MemoizedFibonacci {
  def fib(n: Int): BigInt = {
    @scala.annotation.tailrec
    def fibHelper(n: Int, acc1: BigInt, acc2: BigInt): BigInt = {
      if (n == 0) acc1
      else if (n == 1) acc2
      else fibHelper(n - 1, acc2, acc1 + acc2)
    }

    fibHelper(n, 0, 1)
  }
}