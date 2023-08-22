object Q1_array extends App {
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // Define the rational numbers as arrays of numerators and denominators
  val numerators = Array(3, 5, 2)    // Numerators: x, y, z
  val denominators = Array(4, 8, 7)  // Denominators: x, y, z

  // Calculate x - y - z
  val xNumer = numerators(0) * denominators(1) //3*8=24
  val yNumer = numerators(1) * denominators(0)//5*4=20
  val xyNumer = xNumer-yNumer//24-20=4
  val xyDenom = denominators(0) * denominators(1)//8*4=32
  val zNumer = numerators(2)* xyDenom//2*32=64
  val xyzNumer = xyNumer*denominators(2) - zNumer//4*7-64=36
  val xyzDenom = xyDenom * denominators(2)//32*7


  // Simplify the result fraction
  val gcdValue = gcd(xyzNumer.abs, xyzDenom.abs)
  val simplifiedxyzNumer = xyzNumer / gcdValue
  val simplifiedxyztDenom = xyzDenom / gcdValue

  // Print the result
  println(s"Result: $simplifiedxyzNumer/$simplifiedxyztDenom")
}
