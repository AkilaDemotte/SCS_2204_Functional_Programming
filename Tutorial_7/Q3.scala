object Q3 extends App{
  def filterPrime(numbers: List[Int]): List[Int]={
    def isPrime(x: Int,divisor: Int =2): Boolean ={
      if(x<=1) false
      else if (divisor >= x) true
      else if (x % divisor == 0) false
      else isPrime(x, divisor + 1)
    }
    numbers.filter(isPrime(_))
  }
  val numbers = List(1,2,3,4,5,6,7,8,9,10)
  val primeNumbers = filterPrime(numbers)
  println(primeNumbers)

}