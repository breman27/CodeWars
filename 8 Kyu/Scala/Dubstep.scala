/**
 * https://www.codewars.com/kata/551dc350bf4e526099000ae5
 *
 * @param song
 * @return
 */
def songDecoder(song: String): String = {
  song.replaceAll("WUB", " ").split(" ").filter(!_.isEmpty).mkString(" ")
}