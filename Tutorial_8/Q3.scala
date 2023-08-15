object Q3 extends App{
  //convert string to uppercase
  val toUpper:(string=>string)=str1=>str1.toUpperCase()
  //convert String to lower case
  val toLower:(String=>String)=str2=>str2.toLowerCase()
  //Give function as a parameter
  val formatNames:(String,String=>String)=>String=(name,formatFunc)=>formatFunc(name)

  //use slice function to divide string.
  println("Benny--->"+formatNames("BENNY",toUpper))
  println("Niroshan--->"+formatNames("Niroshan",(name:String)=>toUpper(name.slice(0,2))+toLower(name.slice(2,8))))
  println("Saman--->"+formatNames("Saman",toLower))
  println("Kumara--->"+formatNames("Kumara",(name:String)=>toUpper(name.slice(0,1))+toLower(name.slice(1,5))+toUpper(name.slice(5,6))))
}
