/**
 * https://www.codewars.com/kata/529bf0e9bdf7657179000008
 */
object Sudoku {

  def isValid(board: Array[Array[Int]]): Boolean = {
    board.flatten.toList != board.transpose.flatten.toList &&
      (board.filterNot(x => x.sum == 45 && x.reduce(_ ^ _) == 1).toList ++
        board.transpose.filterNot(x => x.sum == 45 && x.reduce(_ ^ _) == 1).toList).isEmpty
  }
}