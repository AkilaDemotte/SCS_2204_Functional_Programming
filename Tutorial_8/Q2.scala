object Q2 extends App{
  val output: Int => String = a => a match{
    case x if x <= 0 => "Negative/Zero is input "
    case x if x % 2 == 0 => "Negative/Zero is input "
    case _ => " Odd number is given"
  }
  print("Enter Integer: ")
  val input = scala.io.StdIn.readInt()
  val result = output(input)
  print(result)
}