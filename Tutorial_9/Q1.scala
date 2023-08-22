object Q1_array extends App {
  // Define the rational numbers as arrays of numerators and denominators
  val numerators = Array(3)    
  val denominators = Array(4)  

  // Calculate the negative of x
  val negXNumer = -numerators(0)
  val negXDenom = denominators(0)
  val negX = (negXNumer, negXDenom)

  // Print the results
  println(s"Negative of x: $negXNumer/$negXDenom")
  
}
