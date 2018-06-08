

object Gcd {
  def main(args: Array[String]){
    val res = gcd(args(0).toInt,args(1).toInt)
    //command line arguments passed to gcd function
    println("GCD of "+args(0)+" and "+args(1)+" is "+res)
  }
  //Gcd function to calculate gcd of 2 nos.
  def gcd(a:Int,b:Int): Int = if (b==0) a else gcd(b,a%b)
}
