object Q2 extends App {
  def patternMatching(n:Int):String = n match{
    case x if x <= 0 => "Negetive"
    case x if x == 0 => "Zero"
    case x if x%2 == 0 => "Even"
    case x => "Odd"
  }
  println("Enter the number:")
  var n = scala.io.StdIn.readInt()
  println(patternMatching(n))

}
