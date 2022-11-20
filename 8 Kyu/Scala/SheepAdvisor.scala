object SheepAdvisor {
  def warnTheSheepCheck(queue: Array[String]): String = {
    val pos = queue.reverse.zip(LazyList.from(1)).collectFirst{case("wolf", x) => x}.get
    if(pos == 1) "Pls go away and stop eating my sheep"
    else s"Oi! Sheep number ${pos-1}! You are about to be eaten by a wolf!"
  }
}