object Q5 extends App  {
  def addEven(n:Int):Int={
    if(n<=0){0}
    else{
      if((n %2) == 0){n+addEven(n-2)}
      else( addEven(n-1))
    }

  }
  var result = addEven(5)
  println("Addition of even numbers = " + result)

}
