object Q2 extends App {
  def wordCount(l: List[String]): Int = {
    val wCount = l.map(x => x.length).reduce((x, y) => x + y)
    wCount;
  }

  val words = List("apple", "banana", "cherry", "date")
  val count = wordCount(words)
  println(s"Total count of letter occurrences: $count")
}