/**
 * https://www.codewars.com/kata/57fd696e26b06857eb0011e7
 */
object HungarianVowel {
  def dative(word: String): String = {
    // Implement me! :)
    val nek = "e, é, i, í, ö, ő, ü, ű"
    val nak = "a, á, o, ó, u, ú"
    if (nek.map(x => x -> word.lastIndexOf(x)).maxBy(_._2)._2 > nak.map(x => x -> word.lastIndexOf(x)).maxBy(_._2)._2) {
      word + "nek"
    }
    else {
      word + "nak"
    }
  }
}