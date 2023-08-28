object Q1 extends App {
  def convertAvg(l: List[Double]): Double = {
    val fahTotal = l.map(x => (x * 9 / 5) + 32).reduce((x, y) => x + y)
    val fahAvg = fahTotal / l.length
    fahAvg
  }

  val tempCel = List(0.0, 10.0, 20.0, 30.0)
  val avgTempInFah = convertAvg(tempCel)
  println(s"Average Fahrenheit temperature: $avgTempInFah")
}

