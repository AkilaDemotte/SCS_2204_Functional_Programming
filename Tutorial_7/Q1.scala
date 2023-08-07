object Q1 extends App{
  def filterEvenNumbers(numbers: List[Int]):List[Int] = {
    numbers.filter(x => x % 2 == 0)
  }
  val Numbers=List(1,2,3,4,5,6,7,8,9,10)
  val evenNumbers=filterEvenNumbers(Numbers)
  println(evenNumbers)
}