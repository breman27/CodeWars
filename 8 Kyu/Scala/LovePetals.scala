/**
 * https://www.codewars.com/kata/57f24e6a18e9fad8eb000296
 */
object LovePetals {
  def howMuchILoveYou(petals: Int) = {
    val options = Vector("I love you", "a little", "a lot", "passionately", "madly", "not at all")
    options((petals - 1) % options.length)
  }
}