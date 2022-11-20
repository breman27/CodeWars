/**
 * https://www.codewars.com/kata/54b724efac3d5402db00065e
 */
object MorseDecoder {
  import MorseCodes.morseCodes

  def decode(msg: String) = {
    msg.trim.split("   ").map(word => word.split(" ").map(morseCodes(_)).mkString).mkString(" ")
  }
}