/**
 * https://www.codewars.com/kata/513e08acc600c94f01000001
 */
object RGBToHex {

  def rgb(r: Int, g: Int, b: Int): String = {
    val updatedR = if(r > 255) 255 else if(r < 0) 0 else r
    val updatedG = if(g > 255) 255 else if(g < 0) 0 else g
    val updatedB = if(b > 255) 255 else if(b < 0) 0 else b
    f"${updatedR}%02X" + f"${updatedG}%02X" + f"${updatedB}%02X"
  }
}