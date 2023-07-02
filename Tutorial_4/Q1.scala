object Q1 extends App {
  //function to calculate the interest
  def interest (dAmount:Double):Double = dAmount match{
    case x if x <= 0 => 0
    case x if x <= 20000 => x*0.02
    case x if x <= 200000 => x*0.04
    case x if x <= 2000000 => x*0.035
    case x if x >  2000000 => x*0.065
  }
  //Getting deposite amount
  println("Enter the deposite amount:")
  var dAmount = scala.io.StdIn.readDouble()

  //print deposite value
  println("Interest for "+dAmount+" is "+interest(dAmount) )
}
