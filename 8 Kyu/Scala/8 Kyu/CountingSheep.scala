object CountingSheep {
  def countSheep(sheep: Array[Boolean]): Int = sheep.filter(x => x == true).size
}