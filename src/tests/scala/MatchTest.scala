package tests.scala

import janala.Main
import catg.CATG

object MatchTest {

  def main(args: Array[String]) {
    val n = Main.readInt(0)
    println(n)
    val o = Main.readInt(1)
    println(o)
    val x = (n,o)
    x match {
      case (x,0) =>
        println("Found a 0")
      case p @ (x:Int,y:Int) =>
        Main.MakeSymbolic(p._2)
        Main.MakeSymbolic(y)
        if(y>10) println("Y is greater than 10") else println("Y is less than 10")
      case _ => println("Fell out the bottom")
    }
  }
}
