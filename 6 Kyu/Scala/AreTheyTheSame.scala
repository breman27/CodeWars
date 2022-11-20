/**
 * https://www.codewars.com/kata/550498447451fbbd7600041c
 */
object AreTheyTheSame {
  def comp(seq1: Seq[Int], seq2: Seq[Int]) = {
    if (seq1 == null || seq2 == null) false
    else seq1.map(x => x * x).sorted == seq2.sorted
  }
}