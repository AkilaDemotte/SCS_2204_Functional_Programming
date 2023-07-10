object Q1 extends App {
  //find gcd
  def gcd(a:Int,b:Int): Int=b match{
      case 0 => a
      case x if x>a => gcd(x,a)
      case _ => gcd(b,a%b)
  }
//find prime or not.
  def isPrime(p:Int,n:Int=2): Boolean=n match{
    case x if(x==p)=>true
    case x if gcd(p,x)>1 => false
    case x => isPrime(p,x+1)
  }
println(isPrime(10))
}
