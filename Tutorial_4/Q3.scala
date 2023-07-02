object Q3 extends App{
  //convert string to uppercase
  def toUpper(str1:String):String=str1.toUpperCase()
  //convert String to lower case
  def toLower(str2:String):String=str2.toLowerCase()
  //Give function as a parameter
  def formatNames(name:String,formatFunc:String=>String):String=formatFunc(name)

  //use slice function to divide string.
  println("Benny--->"+formatNames("BENNY",toUpper))
  println("Niroshan--->"+formatNames("Niroshan",(name:String)=>toUpper(name.slice(0,2))+toLower(name.slice(2,8))))
  println("Saman--->"+formatNames("Saman",toLower))
  println("Kumara--->"+formatNames("Kumara",(name:String)=>toUpper(name.slice(0,1))+toLower(name.slice(1,5))+toUpper(name.slice(5,6))))
}
