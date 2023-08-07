object Q2 extends App{
  def calculateSquare(numbers: List[Int]):List[Int]={
    val square = (x: Int) => x*x
    numbers.map(square)
  }
  val numbers = List(1,2,3,4,5)
  val squares = calculateSquare(numbers)
  println(squares)
}