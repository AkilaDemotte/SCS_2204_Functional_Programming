object Q1 extends App{
  val interest: Double => Double = depositAmount => depositAmount match{
    case x if x<=20000 => depositAmount * 0.02
    case x if x<=200000 => depositAmount * 0.04
    case x if x<=2000000 => depositAmount * 0.035
    case _ => depositAmount * 0.065
  }
  print("Enter the deposit amount in Rs.: ")
  val depositAmount = scala.io.StdIn.readInt()
  val interestAmount = interest(depositAmount)
  println(s"The interest earned is Rs. $interestAmount")
}
