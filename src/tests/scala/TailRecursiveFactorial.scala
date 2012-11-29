package tests.scala

import janala.Main
import scala.annotation.tailrec

object TailRecursiveFactorial {
  @tailrec def fac(x: BigInt, accumulator: BigInt = 1): BigInt = {
    if (x < 2) accumulator
    else fac(x-1, accumulator*x)
  }

  def main(args:Array[String]) = {
    println(fac(20))
    val n = Main.readInt(0)
    Main.MakeSymbolic(n)
    var f:BigInt = 0
    if(n > 10) {
      f = fac(n)
      assert(f > 100)
      println("Factorial: " + n + " > 10: " + f)
      if(2*n > 20) {
        println("Found easy case")
        assert(f>10000)
      } else {
        assert(false)
        println("This is the impossible clause")
      }
    } else {
      f = fac(n)
      assert(f >= 0 && f <= 100)
      println("Factorial: " + n + " < 10: " + f)
    }
  }
}