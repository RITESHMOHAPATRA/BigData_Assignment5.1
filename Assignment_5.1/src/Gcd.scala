

object Gcd {
  def main(args: Array[String]){
    val res = gcd(args(0).toInt,args(1).toInt)
    println("GCD of "+args(0)+" and "+args(1)+" is "+res)
  }
  def gcd(a:Int,b:Int): Int = if (b==0) a else gcd(b,a%b)
}